package ru.yandex.egor.diadocmock.repo;

import org.springframework.data.repository.CrudRepository;
import ru.yandex.egor.diadocmock.model.Organization;

public interface OrganizationRepo extends CrudRepository<Organization, String> {
}
