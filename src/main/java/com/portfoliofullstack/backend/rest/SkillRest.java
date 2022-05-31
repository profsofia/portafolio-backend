package com.portfoliofullstack.backend.rest;

import com.portfoliofullstack.backend.excepciones.ResourceNotFoundException;
import com.portfoliofullstack.backend.model.Skills;
import com.portfoliofullstack.backend.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class SkillRest {
    @Autowired
    private SkillsRepository skillsRepository;


    @GetMapping("/skills")
    public List<Skills> verSkills(){
        return skillsRepository.findAll();
    }

    @GetMapping("/skills/{id}")
    public ResponseEntity<Skills> buscarSkillId(@PathVariable Long id){
        Skills skills = skillsRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("No se encontró la skill que buscabas"));
        return ResponseEntity.ok(skills);
    }

    @PutMapping("/skills/{id}")
    public ResponseEntity <Skills> actualizarSkills(@PathVariable Long id, @RequestBody Skills editSkill){
        Skills skills = skillsRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("No se encontró la practica que buscabas"));
        skills.setSkill(editSkill.getSkill());
        Skills skillActualizado = skillsRepository.save(skills);
        return ResponseEntity.ok(skillActualizado);
    }
    @PostMapping("/skills")
    public Skills guardar(@RequestBody Skills skills){
        return skillsRepository.save(skills);
    }


    @DeleteMapping("/skills/{id}")
    public void deleteById (@PathVariable("id") Long id){
        skillsRepository.deleteById(id);
    }
}
