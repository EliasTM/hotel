package com.evaluacion.administrar.service;

import com.evaluacion.administrar.entidades.Rol;

import java.util.List;

public interface RolService {


    public List<Rol> findAll();

    public Rol save(Rol rol);

    public Rol findById(Integer id);

    public void delete(Integer id);
}
