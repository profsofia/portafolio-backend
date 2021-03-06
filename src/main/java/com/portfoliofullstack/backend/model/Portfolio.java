package com.portfoliofullstack.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Getter
@Setter
@Table(name = "portafolio")
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imagenBanner;
    private String imagenPerfil;
    private String nombre;
    private String descripcion;
    public Portfolio() {
    }

    public Portfolio(String imagenBanner, String imagenPerfil, String nombre, String descripcion) {
        this.imagenBanner = imagenBanner;
        this.imagenPerfil = imagenPerfil;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
