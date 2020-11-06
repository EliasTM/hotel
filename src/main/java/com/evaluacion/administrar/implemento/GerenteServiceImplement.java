package com.evaluacion.administrar.implemento;

import com.evaluacion.administrar.dao.GerenteDAO;
import com.evaluacion.administrar.entidades.Gerente;
import com.evaluacion.administrar.service.GerenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GerenteServiceImplement implements GerenteService {
    @Autowired
    private GerenteDAO gerenteDAO;

    @Override
    public List<Gerente> findAll() {
        return (List<Gerente>) gerenteDAO.findAll();
    }

    @Override
    public Gerente save(Gerente gerente) {
        return gerenteDAO.save(gerente);
    }

    @Override
    public Gerente findById(Integer id) {
        return gerenteDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
            gerenteDAO.deleteById(id);
    }
}
