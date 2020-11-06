package com.evaluacion.administrar.implemento;

import com.evaluacion.administrar.dao.HabitacionDAO;
import com.evaluacion.administrar.entidades.Habitacion;
import com.evaluacion.administrar.entidades.Recepcionista;
import com.evaluacion.administrar.service.HabitacionService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitacionServiceImplement implements HabitacionService {
    @Autowired
    private HabitacionDAO habitacionDAO;


    @Override
    public List<Habitacion> findAll(String estado) {
        return (List<Habitacion>) habitacionDAO.listarEstado(estado);
    }

    @Override
    public List<Habitacion> listarHabitaciones(int idHabitacion) {
        return (List<Habitacion>) habitacionDAO.listarHabitaciones(idHabitacion);
    }


    @Override
    public Habitacion save(Habitacion habitacion) {
        return habitacionDAO.save(habitacion);
    }

    @Override
    public Habitacion findById(Integer id) {
        return habitacionDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {

        habitacionDAO.deleteById(id);
    }
}
