package com.evaluacion.administrar.service;

import com.evaluacion.administrar.entidades.Cliente;

import java.util.List;

public interface ClienteService {

    public List<Cliente> findAll();

    public Cliente save(Cliente cliente);

    public Cliente findById(Integer id);

    public void delete(Integer id);
}
