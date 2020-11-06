package com.evaluacion.administrar.service;

import com.evaluacion.administrar.entidades.Gerente;

import java.util.List;

public interface GerenteService {


    public List<Gerente> findAll();

    public Gerente save(Gerente gerente);

    public Gerente findById(Integer id);

    public void delete(Integer id);
}
