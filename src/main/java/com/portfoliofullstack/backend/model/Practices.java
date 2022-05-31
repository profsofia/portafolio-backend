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
    private String practicaNombre;
    private String tecnologia;
    private String imagenPractica;
    private String url;

    public Practices() {
    }

    public Practices(String practicaNombre, String tecnologia, String imagenPractica, String url) {
        this.practicaNombre = practicaNombre;
        this.tecnologia = tecnologia;
        this.imagenPractica = imagenPractica;
        this.url = url;
    }
}
