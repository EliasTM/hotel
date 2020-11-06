package com.evaluacion.administrar.controlador;


import com.evaluacion.administrar.entidades.Cliente;
import com.evaluacion.administrar.entidades.Gerente;
import com.evaluacion.administrar.service.ClienteService;
import com.evaluacion.administrar.service.GerenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gerente")
public class GerenteController {

    @Autowired
    private GerenteService gerenteService;

    @GetMapping()
    public ResponseEntity<List<Gerente>> listarGerente(){
        return ResponseEntity.ok(gerenteService.findAll());
    }
    @GetMapping("{id}")
    public ResponseEntity<Gerente> componenteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(gerenteService.findById(id));
    }

    @PostMapping("/registrar")
    public ResponseEntity<Gerente> crear(@Validated @RequestBody Gerente gerente) {
        return ResponseEntity.ok(gerenteService.save(gerente));
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Gerente> update(@RequestBody Gerente gerente) {
        return ResponseEntity.ok(gerenteService.save(gerente));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Gerente> delete(@PathVariable("id") Integer id) {
        gerenteService.delete(id);
        return ResponseEntity.ok(null);
    }
}
