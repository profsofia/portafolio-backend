package com.portfoliofullstack.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Getter
@Setter
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imgagenBanner;
    private String imagenPerfil;
    private String nombre;
    private String descripcion;
    public Portfolio() {
    }

    public Portfolio(String imgagenBanner, String imagenPerfil, String nombre, String descripcion) {
        this.imgagenBanner = imgagenBanner;
        this.imagenPerfil = imagenPerfil;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
