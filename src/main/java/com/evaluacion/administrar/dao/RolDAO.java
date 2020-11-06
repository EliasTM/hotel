package com.evaluacion.administrar.dao;


import com.evaluacion.administrar.entidades.Rol;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolDAO extends PagingAndSortingRepository<Rol,Integer> {
}
