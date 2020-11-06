package com.evaluacion.administrar.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rol {

    @Id
    private int idRol;
    private String descripcion;

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Rol(int idRol, String descripcion) {
        this.idRol = idRol;
        this.descripcion = descripcion;
    }

    public Rol() {
    }
}
