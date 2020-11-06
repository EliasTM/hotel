package com.evaluacion.administrar.dao;

import com.evaluacion.administrar.entidades.Gerente;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GerenteDAO extends PagingAndSortingRepository<Gerente, Integer> {
}
