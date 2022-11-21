package ru.yandex.egor.diadocmock.security;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import ru.yandex.egor.diadocmock.exception.AuthorizationException;
import ru.yandex.egor.diadocmock.model.User;
import ru.yandex.egor.diadocmock.repo.ApiRepo;
import ru.yandex.egor.diadocmock.repo.UserRepo;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@Component
@Slf4j
@RequiredArgsConstructor
public class AuthFilter extends OncePerRequestFilter {

    private final ApiRepo apiRepo;
    private final UserRepo userRepo;


    private static final String DIADOCAUTH = "DiadocAuth";
    private static final String DIADOC_API_CLIENT_ID = "ddauth_api_client_id";
    private static final String DDAUTH_TOKEN = "ddauth_token";

    @SneakyThrows
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authorization = request.getHeader("Authorization");
        if (authorization == null || !authorization.contains(DIADOCAUTH) || authorization.split(" ").length != 3) {
            throw new AuthorizationException();
        }
        String[] tokens = authorization.split(" ")[2].split(",");
        if (tokens.length != 2 || !tokens[0].split("=")[0].equals(DIADOC_API_CLIENT_ID) || !tokens[1].split("=")[0].equals(DDAUTH_TOKEN)) {
            filterChain.doFilter(request, response);
            return;
        }
        String apiToken = tokens[0].split("=")[1];
        if (apiRepo.findById(apiToken).isEmpty()) {
            filterChain.doFilter(request, response);
            return;
        }
        String userToken = tokens[1].split("=")[1];
        Optional<User> user = userRepo.findByToken(userToken);
        if (user.isEmpty()) {
            filterChain.doFilter(request, response);
            return;
        }
        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(
                user.get(), null, user.get().getAuthorities()
        );
        SecurityContextHolder.getContext().setAuthentication(auth);
        filterChain.doFilter(request, response);
    }
}
