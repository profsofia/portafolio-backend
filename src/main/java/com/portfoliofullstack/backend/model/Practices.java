package com.portfoliofullstack.backend.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Data
@Getter @Setter
public class Practices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_practices;
    private String practica;

    public Practices() {
    }

    public Practices(String practica) {
        this.practica = practica;
    }

}
