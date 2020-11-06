package com.evaluacion.administrar.implemento;

import com.evaluacion.administrar.dao.ClienteDAO;
import com.evaluacion.administrar.entidades.Cliente;
import com.evaluacion.administrar.entidades.response.ResponseTransactionModelOk;
import com.evaluacion.administrar.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImplement implements ClienteService {

    @Autowired
    private ClienteDAO clienteDAO;

    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDAO.findAll();
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteDAO.save(cliente);
    }

    @Override
    public Cliente findById(Integer id) {

        return  clienteDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
            clienteDAO.deleteById(id);
    }
}
