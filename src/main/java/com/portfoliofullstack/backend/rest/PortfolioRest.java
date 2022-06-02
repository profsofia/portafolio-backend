package com.portfoliofullstack.backend.rest;

import com.portfoliofullstack.backend.excepciones.ResourceNotFoundException;
import com.portfoliofullstack.backend.model.Portfolio;
import com.portfoliofullstack.backend.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://portofiofullstack.web.app")
public class PortfolioRest {
    @Autowired
    private PortfolioRepository portfolioRepository;
    @GetMapping("/portafolio")
    public List<Portfolio> verTodoElPortfolio(){
        return portfolioRepository.findAll();
    }

    @GetMapping("/portafolio/{id}")
    public ResponseEntity <Portfolio> buscarById(@PathVariable Long id){
        Portfolio portfolio = portfolioRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("No se encontró lo que buscabas"));
        return ResponseEntity.ok(portfolio);
    }
    @PutMapping("/portafolio/{id}")
    public ResponseEntity <Portfolio> actualizar(@PathVariable Long id, @RequestBody Portfolio editPortfolio){
        Portfolio portfolio = portfolioRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("No se encontró lo que buscabas"));
        portfolio.setNombre(editPortfolio.getNombre());
        portfolio.setImagenBanner(editPortfolio.getImagenBanner());
        portfolio.setImagenPerfil(editPortfolio.getImagenPerfil());
        portfolio.setNombre(editPortfolio.getNombre());
        portfolio.setDescripcion(editPortfolio.getDescripcion());
        Portfolio portfolioActualizado = portfolioRepository.save(portfolio);
        return ResponseEntity.ok(portfolioActualizado);
    }

    @PostMapping("/portafolio")
    public Portfolio guardar(@RequestBody Portfolio portfolio){
        return portfolioRepository.save(portfolio);
    }


    @DeleteMapping("/portafolio/{id}")
    public void deleteById (@PathVariable("id") Long id){
        portfolioRepository.deleteById(id);
    }
}
