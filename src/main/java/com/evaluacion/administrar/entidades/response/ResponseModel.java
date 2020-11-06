package com.evaluacion.administrar.entidades.response;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResponseModel<T> {

    private T data;
    private Integer code;
    private String message;

    public ResponseModel(T data) {
        validateData(data);
    }

    private void validateData(T data) {
        if (data != null) {
            this.data = data;
            this.code = HttpStatus.OK.value();
            this.message = "Se obtuvo resultado de la consulta";
        } else {
            this.code = HttpStatus.NO_CONTENT.value();
            this.message = "No se han obtenido resultados";
        }
    }
}
