package com.evaluacion.administrar.implemento;

import com.evaluacion.administrar.dao.RolDAO;
import com.evaluacion.administrar.entidades.Rol;
import com.evaluacion.administrar.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImplement implements RolService {
    @Autowired
    private RolDAO rolDAO;

    @Override
    public List<Rol> findAll() {
        return (List<Rol>) rolDAO.findAll();
    }

    @Override
    public Rol save(Rol rol) {
        return rolDAO.save(rol);
    }

    @Override
    public Rol findById(Integer id) {
        return rolDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
            rolDAO.deleteById(id);
    }
}
