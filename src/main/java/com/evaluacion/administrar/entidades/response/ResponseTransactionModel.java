package com.evaluacion.administrar.entidades.response;

import lombok.Data;

@Data
public class ResponseTransactionModel<T> {
    private Integer code;
    private String message;
    private T detail;

    public ResponseTransactionModel() {
    }

    public ResponseTransactionModel(Integer code, String message, T detail) {
        this.code = code;
        this.message = message;
        this.detail = detail;
    }
}