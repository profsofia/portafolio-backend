package com.portfoliofullstack.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_contact;
    private String name;
    private String email;
    private String text;

    public Contact() {
    }

    public Contact(String name, String email, String text) {
        this.name = name;
        this.email = email;
        this.text = text;
    }
}
