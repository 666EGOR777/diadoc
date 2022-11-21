package ru.yandex.egor.diadocmock.contoller;

import Diadoc.Api.Proto.AcquireCounteragentProtos;
import Diadoc.Api.Proto.AsyncMethodResultProtos;
import Diadoc.Api.Proto.CounteragentProtos;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.egor.diadocmock.exception.ApiExpireException;
import ru.yandex.egor.diadocmock.exception.AuthoritiesException;
import ru.yandex.egor.diadocmock.service.CounteragentService;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
@PreAuthorize("hasPermission('ManageCounteragents')")
public class CounteragentController {

    private final CounteragentService service;

    @GetMapping("/V2/GetCounteragents")
    public CounteragentProtos.CounteragentList getCounteragents(
            Principal principal,
            @RequestParam String myOrgId,
            @RequestParam String counteragentStatus,
            @RequestParam String afterIndexKey
    ) throws ApiExpireException, AuthoritiesException {

        return service.getCounteragents(principal, myOrgId, counteragentStatus, afterIndexKey);
    }

    @PostMapping("/V2/AcquireCounteragent")
    public AsyncMethodResultProtos.AsyncMethodResult acquireCounterAgent(
            Principal principal,
            @RequestParam String myOrgId,
            @RequestParam String myDepartmentId,
            AcquireCounteragentProtos.AcquireCounteragentRequest request
    ) throws AuthoritiesException, ApiExpireException {

        return service.acquireCounterAgent(principal, myOrgId, myDepartmentId, request);
    }


}
