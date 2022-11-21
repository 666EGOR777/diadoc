package ru.yandex.egor.diadocmock.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import ru.yandex.egor.diadocmock.model.User;
import ru.yandex.egor.diadocmock.repo.UserRepo;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepo userRepo;

    @GetMapping("/V3/Authenticate")
    public String auth(@RequestParam String type, Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword loginPassword, @RequestHeader("Authorization") String token) {
        if (!type.equals("password")) {
            return null;
        }

        User user = userRepo.findUserByLoginAndPassword(loginPassword.getLogin(), loginPassword.getPassword());

        return user == null ? null : user.getToken();
    }

}
