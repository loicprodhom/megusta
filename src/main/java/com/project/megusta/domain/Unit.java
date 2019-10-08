package com.project.megusta.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "unit_id")
    private Long unitId;

    @Column(name = "unit_name")
    private String name;

    private String abbreviation;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unit")
    private List<Contains> contents;
}
