package com.evaluacion.administrar.implemento;

import com.evaluacion.administrar.dao.RecepcionistaDAO;
import com.evaluacion.administrar.entidades.Recepcionista;
import com.evaluacion.administrar.service.RecepcionistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecepcionistaServiceImplement implements RecepcionistaService {
    @Autowired
    private RecepcionistaDAO recepcionistaDAO;

    @Override
    public List<Recepcionista> findAll() {

        return (List<Recepcionista>) recepcionistaDAO.findAll();
    }

    @Override
    public Recepcionista save(Recepcionista recepcionista) {
        return recepcionistaDAO.save(recepcionista);
    }

    @Override
    public Recepcionista findById(Integer id) {
        return recepcionistaDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        recepcionistaDAO.deleteById(id);

    }
}
