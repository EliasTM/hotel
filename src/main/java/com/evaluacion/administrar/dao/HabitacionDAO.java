package com.evaluacion.administrar.dao;


import com.evaluacion.administrar.entidades.Habitacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabitacionDAO extends PagingAndSortingRepository<Habitacion, Integer> {

    @Query("select c from Habitacion c where " +
            " c.estado = :estado order by c.idHabitacion, c.idHabitacion desc ")
    List<Habitacion> listarEstado(@Param("estado") String estado);


    @Query("select c from Habitacion c where " +
            " c.idHabitacion = :idHabitacion order by c.idHabitacion, c.idHabitacion desc ")
    List<Habitacion> listarHabitaciones(@Param("idHabitacion") int idHabitacion);





}
