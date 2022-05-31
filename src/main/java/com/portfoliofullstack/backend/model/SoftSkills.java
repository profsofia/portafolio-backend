package com.portfoliofullstack.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Getter @Setter
public class SoftSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_skillSoft;
    private String skillSoft;
    private String imgSkillSoft;

    public SoftSkills() {
    }

    public SoftSkills(String skillSoft, String imgSkillSoft) {
        this.skillSoft = skillSoft;
        this.imgSkillSoft = imgSkillSoft;
    }
}
