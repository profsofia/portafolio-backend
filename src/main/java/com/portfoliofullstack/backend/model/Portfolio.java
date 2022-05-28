package com.portfoliofullstack.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String titulo;
    private String skills;
    private String proyectos;

    public Portfolio() {
    }

    public Portfolio(String nombre, String titulo, String skills, String proyectos) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.skills = skills;
        this.proyectos = proyectos;
    }
}
