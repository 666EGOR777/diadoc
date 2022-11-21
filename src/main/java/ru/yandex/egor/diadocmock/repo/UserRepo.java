package ru.yandex.egor.diadocmock.repo;


import org.springframework.data.repository.CrudRepository;
import ru.yandex.egor.diadocmock.model.User;

import java.util.Optional;

public interface UserRepo extends CrudRepository<User, String> {
    public User findUserByLoginAndPassword(String username, String password);
    public Optional<User> findByToken(String token);

}
