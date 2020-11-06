package com.evaluacion.administrar.service;


import com.evaluacion.administrar.entidades.Habitacion;

import java.util.List;

public interface HabitacionService {


    public List<Habitacion> findAll(String estado);
    public List<Habitacion> listarHabitaciones(int idHabitacion);


    public Habitacion save(Habitacion habitacion);

    public Habitacion findById(Integer id);

    public void delete(Integer id);
}
