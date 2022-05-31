package com.portfoliofullstack.backend.rest;

import com.portfoliofullstack.backend.excepciones.ResourceNotFoundException;
import com.portfoliofullstack.backend.model.Practices;
import com.portfoliofullstack.backend.repository.PracticesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class PracticesRest {
    @Autowired
    private PracticesRepository practicesRepository;

    @GetMapping("/practices")
    public List <Practices> verPractices(){
        return practicesRepository.findAll();
    }
    @GetMapping("/practices/{id}")
    public ResponseEntity<Practices> buscarPracId(@PathVariable Long id){
        Practices practices = practicesRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("No se encontró la practica que buscabas"));
        return ResponseEntity.ok(practices);
    }
    @PutMapping("/practices/{id}")
    public ResponseEntity <Practices> actualizarPractices(@PathVariable Long id, @RequestBody Practices editPractices){
        Practices practices = practicesRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("No se encontró la practica que buscabas"));
        practices.setPracticaNombre(editPractices.getPracticaNombre());
        practices.setTecnologia(editPractices.getTecnologia());
        practices.setImagenPractica(editPractices.getImagenPractica());
        practices.setUrl(editPractices.getUrl());
        Practices practicaActualizada = practicesRepository.save(practices);
        return ResponseEntity.ok(practicaActualizada);
    }
    @PostMapping("/practices")
    public Practices guardar(@RequestBody Practices practices){
        return practicesRepository.save(practices);
    }


    @DeleteMapping("/practices/{id}")
    public void deleteById (@PathVariable("id") Long id){
        practicesRepository.deleteById(id);
    }

}
