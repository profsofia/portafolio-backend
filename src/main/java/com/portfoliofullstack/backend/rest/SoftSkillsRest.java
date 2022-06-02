package com.portfoliofullstack.backend.rest;
import com.portfoliofullstack.backend.model.SoftSkills;
import com.portfoliofullstack.backend.repository.SoftSkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://portofiofullstack.web.app")
public class SoftSkillsRest {
    @Autowired
    private SoftSkillsRepository softSkillsRepository;

    @GetMapping("/softskills")
    public List<SoftSkills> verSoftSkills(){
        return softSkillsRepository.findAll();
    }
}
