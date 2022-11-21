package ru.yandex.egor.diadocmock.service;

import Diadoc.Api.Proto.AsyncMethodResultProtos;
import Diadoc.Api.Proto.CounteragentProtos;
import Diadoc.Api.Proto.TotalCountTypeProtos;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import ru.yandex.egor.diadocmock.exception.ApiExpireException;
import ru.yandex.egor.diadocmock.exception.AuthoritiesException;
import ru.yandex.egor.diadocmock.model.Organization;
import ru.yandex.egor.diadocmock.model.Relation;
import ru.yandex.egor.diadocmock.model.User;
import ru.yandex.egor.diadocmock.repo.OrganizationRepo;
import ru.yandex.egor.diadocmock.repo.RelationRepo;
import ru.yandex.egor.diadocmock.repo.UserRepo;

import java.security.Principal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CounteragentService {

    private final OrganizationRepo organizationRepo;
    private final UserRepo userRepo;
    private final RelationRepo relationRepo;

    @GetMapping("/V2/GetCounteragents")
    public Diadoc.Api.Proto.CounteragentProtos.CounteragentList getCounteragents(
            Principal principal,
            String myOrgId,
            String counteragentStatus,
            String afterIndexKey
    ) throws AuthoritiesException, ApiExpireException {
        Organization org = getOrganization(principal, myOrgId);

        checkExpireDate(org);

        CounteragentProtos.CounteragentStatus status;

        if (counteragentStatus.equals("IsMyCounteragent")) {
            status = CounteragentProtos.CounteragentStatus.IsMyCounteragent;
        } else if (counteragentStatus.equals("InvitesMe")) {
            status = CounteragentProtos.CounteragentStatus.InvitesMe;
        } else if (counteragentStatus.equals("IsInvitedByMe")) {
            status = CounteragentProtos.CounteragentStatus.IsInvitedByMe;
        } else {
            status = CounteragentProtos.CounteragentStatus.IsRejectedByMe;
        }

        List<Relation> relationList = relationRepo.findByFOrgAndStatus(org, status);

        var listBuilder = CounteragentProtos.CounteragentList.newBuilder()
                .setTotalCount(relationList.size())
                .setTotalCountType(TotalCountTypeProtos.TotalCountType.Equal);

        var list = relationList.stream()
                .filter(rel -> rel.getId() >= Long.parseLong(afterIndexKey))
                .map(this::mapRelationToCounteragent)
                .toList();

        for (int i = 0; i < list.size(); i++) {
            listBuilder = listBuilder.setCounteragents(i, list.get(i));
        }
        return listBuilder.build();
    }

    private CounteragentProtos.Counteragent mapRelationToCounteragent(Relation relation) {
        return CounteragentProtos.Counteragent.newBuilder()
                .setCurrentStatus(relation.getStatus())
                .setOrganization(relation.getSOrg().getOrg())
                .setLastEventTimestampTicks(relation.getTimestamp())
                .build();
    }


    public Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult acquireCounterAgent(
            Principal principal,
            String myOrgId,
            String myDepartmentId,
            Diadoc.Api.Proto.AcquireCounteragentProtos.AcquireCounteragentRequest request
    ) throws AuthoritiesException, ApiExpireException {

        Organization org = getOrganization(principal, myOrgId);

        checkExpireDate(org);

        if (request.getOrgId() == null || !organizationRepo.existsById(request.getOrgId())) {
            // TODO: сделать что-нибудь с приглашением если орги нету в диадоке
            return null;
        }

        Organization secondOrg = organizationRepo.findById(request.getOrgId()).get();
        if (relationRepo.findByFOrgAndAndSOrgAndStatus(org, secondOrg, CounteragentProtos.CounteragentStatus.InvitesMe) != null) {
            Relation rel = relationRepo.findByFOrgAndAndSOrgAndStatus(org, secondOrg, CounteragentProtos.CounteragentStatus.InvitesMe);
            rel.setStatus(CounteragentProtos.CounteragentStatus.IsMyCounteragent);
            rel.setTimestamp(System.currentTimeMillis());
            relationRepo.save(rel);
            Relation newRel = new Relation();
            newRel.setStatus(CounteragentProtos.CounteragentStatus.IsMyCounteragent);
            newRel.setFOrg(org);
            newRel.setSOrg(secondOrg);
            newRel.setTimestamp(System.currentTimeMillis());
            relationRepo.save(newRel);
        }

        Relation relFromMe = new Relation();
        relFromMe.setFOrg(org);
        relFromMe.setSOrg(secondOrg);
        relFromMe.setStatus(CounteragentProtos.CounteragentStatus.IsInvitedByMe);
        relFromMe.setTimestamp(System.currentTimeMillis());
        Long relId = relationRepo.save(relFromMe).getId();

        Relation relToMe = new Relation();
        relToMe.setFOrg(secondOrg);
        relToMe.setFOrg(org);
        relToMe.setStatus(CounteragentProtos.CounteragentStatus.InvitesMe);
        relToMe.setTimestamp(System.currentTimeMillis());
        relationRepo.save(relToMe);
        return AsyncMethodResultProtos.AsyncMethodResult.newBuilder().setTaskId(relId.toString()).build();
    }


    private void checkExpireDate(Organization org) throws ApiExpireException {
        if (org.getApiExpireDate().before(new Date())) {
            throw new ApiExpireException();
        }
    }

    private Organization getOrganization(Principal principal, String orgId) throws AuthoritiesException {
        User user = userRepo.findById(principal.getName()).get();
        Optional<Organization> org = organizationRepo.findById(orgId);
        if (org.isEmpty() || org.get() != user.getOrganization()) {
            throw new AuthoritiesException();
        }
        return org.get();
    }

}
