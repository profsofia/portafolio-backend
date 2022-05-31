package com.portfoliofullstack.backend.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_skill;
    private String skill;
    private String imgSkill;

    public Skills() {
    }

    public Skills(String skill, String imgSkill) {
        this.skill = skill;
        this.imgSkill = imgSkill;
    }
}
