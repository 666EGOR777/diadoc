package ru.yandex.egor.diadocmock.model;

import Diadoc.Api.Proto.OrganizationProtos;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="organization")
@Data
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private Date apiExpireDate;

    private OrganizationProtos.Organization org;
}
