package com.evaluacion.administrar.service;

import com.evaluacion.administrar.entidades.Recepcionista;

import java.util.List;

public interface RecepcionistaService {


    public List<Recepcionista> findAll();

    public Recepcionista save(Recepcionista recepcionista);

    public Recepcionista findById(Integer id);

    public void delete(Integer id);
}
