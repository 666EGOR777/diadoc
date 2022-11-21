package ru.yandex.egor.diadocmock.model;


import Diadoc.Api.Proto.CounteragentProtos;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="relationsBetweenCounteragents")
@Data
public class Relation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Enumerated(EnumType.STRING)
    private CounteragentProtos.CounteragentStatus status;
    private String message;

    @ManyToOne
    private Organization fOrg;
    @ManyToOne
    private Organization sOrg;
    private Long timestamp;
}
