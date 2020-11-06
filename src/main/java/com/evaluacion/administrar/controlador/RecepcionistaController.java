package com.evaluacion.administrar.controlador;


import com.evaluacion.administrar.entidades.Habitacion;
import com.evaluacion.administrar.entidades.Recepcionista;
import com.evaluacion.administrar.service.HabitacionService;
import com.evaluacion.administrar.service.RecepcionistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recepcionista")
public class RecepcionistaController {


    @Autowired
    private RecepcionistaService recepcionistaService;

    @GetMapping()
    public ResponseEntity<List<Recepcionista>> listarRecepcionistas(){
        return ResponseEntity.ok(recepcionistaService.findAll());
    }
    @GetMapping("{id}")
    public ResponseEntity<Recepcionista> componenteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(recepcionistaService.findById(id));
    }

    @PostMapping("/registrar")
    public ResponseEntity<Recepcionista> crear(@Validated @RequestBody Recepcionista recepcionista) {
        return ResponseEntity.ok(recepcionistaService.save(recepcionista));
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Recepcionista> update(@RequestBody Recepcionista recepcionista) {
        return ResponseEntity.ok(recepcionistaService.save(recepcionista));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Recepcionista> delete(@PathVariable("id") Integer id) {
        recepcionistaService.delete(id);
        return ResponseEntity.ok(null);
    }
}
