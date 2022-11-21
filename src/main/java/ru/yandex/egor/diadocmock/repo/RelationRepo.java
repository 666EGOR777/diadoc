package ru.yandex.egor.diadocmock.repo;

import Diadoc.Api.Proto.CounteragentProtos;
import org.springframework.data.repository.CrudRepository;
import ru.yandex.egor.diadocmock.model.Organization;
import ru.yandex.egor.diadocmock.model.Relation;

import java.util.List;
import java.util.TreeSet;

public interface RelationRepo extends CrudRepository<Relation, Long> {

    public Relation findByFOrgAndAndSOrgAndStatus(Organization fOrg, Organization sOrg, CounteragentProtos.CounteragentStatus status);
    public List<Relation> findByFOrgAndStatus(Organization org, CounteragentProtos.CounteragentStatus status);

}
