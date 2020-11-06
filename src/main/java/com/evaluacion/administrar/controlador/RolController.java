package com.evaluacion.administrar.controlador;


import com.evaluacion.administrar.entidades.Recepcionista;
import com.evaluacion.administrar.entidades.Rol;
import com.evaluacion.administrar.service.RecepcionistaService;
import com.evaluacion.administrar.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rol")
public class RolController {


    @Autowired
    private RolService rolService;

    @GetMapping()
    public ResponseEntity<List<Rol>> listarRoles(){
        return ResponseEntity.ok(rolService.findAll());
    }
    @GetMapping("{id}")
    public ResponseEntity<Rol> componenteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(rolService.findById(id));
    }

    @PostMapping("/registrar")
    public ResponseEntity<Rol> crear(@Validated @RequestBody Rol rol) {
        return ResponseEntity.ok(rolService.save(rol));
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Rol> update(@RequestBody Rol rol) {
        return ResponseEntity.ok(rolService.save(rol));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Recepcionista> delete(@PathVariable("id") Integer id) {
        rolService.delete(id);
        return ResponseEntity.ok(null);
    }
}
