package ru.yandex.egor.diadocmock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="token")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApiToken {
    @Id
    private String Token;
}
