package ru.yandex.egor.diadocmock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(value = ApiExpireException.class)
    public ResponseEntity expireError() {
        return new ResponseEntity(HttpStatus.PAYMENT_REQUIRED);
    }

    @ExceptionHandler(value = AuthorizationException.class)
    public ResponseEntity authError() {
        return new ResponseEntity(HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(value = AuthoritiesException.class)
    public ResponseEntity authoritiesError() {
        return new ResponseEntity(HttpStatus.FORBIDDEN);
    }
}
