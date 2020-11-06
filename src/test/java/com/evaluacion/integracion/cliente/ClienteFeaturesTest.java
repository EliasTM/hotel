package com.evaluacion.integracion.cliente;


import com.evaluacion.administrar.dao.ClienteDAO;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
@AutoConfigureMockMvc
public class ClienteFeaturesTest {

    @MockBean
    ClienteDAO clienteDAO;



}
