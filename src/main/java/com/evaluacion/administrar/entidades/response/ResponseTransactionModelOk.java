package com.evaluacion.administrar.entidades.response;

import org.springframework.http.HttpStatus;

public class ResponseTransactionModelOk extends ResponseTransactionModel {

    public static final String INSERT = "INSERT";
    public static final String UPDATE = "UPDATE";
    public static final String DELETE = "DELETE";


    public ResponseTransactionModelOk(Object detail,String kindOfTransaction) {
        super(HttpStatus.OK.value(),"OK", detail);
        setMessage(messageTransaction(kindOfTransaction));
    }

    private String messageTransaction(String kindOfTransaction) {
        switch (kindOfTransaction) {
            case INSERT:
                return "Registro Correcto";
            case UPDATE:
                return "Actualizo el registro correcto";
            case DELETE:
                return "Eliminación física de registro correcto";
            default:
                return "Transacción no definida";
        }
    }
}
