package com.evaluacion.administrar.dao;

import com.evaluacion.administrar.entidades.Recepcionista;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecepcionistaDAO extends PagingAndSortingRepository<Recepcionista, Integer> {
}
