package com.evaluacion.administrar.controlador;


import com.evaluacion.administrar.entidades.Habitacion;
import com.evaluacion.administrar.service.HabitacionService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habitacion")
public class HabitacionController {

    @Autowired
    private HabitacionService habitacionService;

    @GetMapping("/listar")
    public ResponseEntity <List<Habitacion> > listarEstado(@RequestParam String estado){
        return ResponseEntity.ok(habitacionService.findAll(estado));
    }

    @GetMapping("/listarhabitaciones")
    public ResponseEntity <List<Habitacion> > listarHabitaciones(@RequestParam int idHabitacion){
        return ResponseEntity.ok(habitacionService.listarHabitaciones(idHabitacion));
    }


    @PostMapping("/registrar")
    public ResponseEntity<Habitacion> crear(@Validated @RequestBody Habitacion habitacion) {
        return ResponseEntity.ok(habitacionService.save(habitacion));
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Habitacion> update(@RequestBody Habitacion habitacion) {
        return ResponseEntity.ok(habitacionService.save(habitacion));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Habitacion> delete(@PathVariable("id") Integer id) {
        habitacionService.delete(id);
        return ResponseEntity.ok(null);
    }
}
