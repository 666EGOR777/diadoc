package ru.yandex.egor.diadocmock.contoller;


import Diadoc.Api.Proto.LoginPasswordProtos;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.egor.diadocmock.service.AuthService;

import java.security.Principal;


/**
 * auth -- реализована авторизация только через loginpassword
 * */
@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @GetMapping("/V3/Authenticate")
    public String auth(@RequestParam String type, LoginPasswordProtos.LoginPassword loginPassword, @RequestHeader("Authorization") String token) {
        return authService.auth(type, loginPassword, token);
    }
}
