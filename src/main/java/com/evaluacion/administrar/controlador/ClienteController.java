package com.evaluacion.administrar.controlador;


import com.evaluacion.administrar.entidades.Cliente;
import com.evaluacion.administrar.entidades.response.ResponseModel;
import com.evaluacion.administrar.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> listarClientes(){

        return ResponseEntity.ok(clienteService.findAll());
    }
    @GetMapping("{id}")
    public ResponseEntity<Cliente> componenteById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(clienteService.findById(id));
    }

    @PostMapping("/registrar")
    public ResponseEntity<Cliente> crear( @RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteService.save(cliente));
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Cliente> update(@RequestBody Cliente model) {
        return ResponseEntity.ok(clienteService.save(model));
    }


    @DeleteMapping("{id}")
    public ResponseEntity<Cliente> delete(@PathVariable("id") Integer id) {
        clienteService.delete(id);
        return ResponseEntity.ok(null);
    }

}
