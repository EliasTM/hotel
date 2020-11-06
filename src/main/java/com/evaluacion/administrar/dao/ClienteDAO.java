package com.evaluacion.administrar.dao;

import com.evaluacion.administrar.entidades.Cliente;
import com.evaluacion.administrar.entidades.Habitacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteDAO extends PagingAndSortingRepository<Cliente, Integer> {



}
