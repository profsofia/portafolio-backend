package com.portfoliofullstack.backend.rest;

import com.portfoliofullstack.backend.excepciones.ResourceNotFoundException;
import com.portfoliofullstack.backend.model.Contact;
import com.portfoliofullstack.backend.model.Skills;
import com.portfoliofullstack.backend.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://portofiofullstack.web.app/")
public class ContactRest {
    @Autowired
    private ContactRepository contactRepository;


    @PutMapping("/contacto/{id}")
    public ResponseEntity<Contact> actualizarSkills(@PathVariable Long id, @RequestBody Contact editContacto){
        Contact contact = contactRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("No se encontro contacto buscabas"));
        contact.setName(editContacto.getName());
        contact.setEmail(editContacto.getEmail());
        contact.setText(editContacto.getText());
        Contact contactoActualizado = contactRepository.save(contact);
        return ResponseEntity.ok(contactoActualizado);
    }
    @PostMapping("/contacto")
    public Contact guardar(@RequestBody Contact contact){
        return contactRepository.save(contact);
    }
}
