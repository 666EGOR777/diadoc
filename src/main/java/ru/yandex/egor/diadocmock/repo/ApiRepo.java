package ru.yandex.egor.diadocmock.repo;

import org.springframework.data.repository.CrudRepository;
import ru.yandex.egor.diadocmock.model.ApiToken;

public interface ApiRepo extends CrudRepository<ApiToken, String> {
}
