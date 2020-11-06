package com.evaluacion.administrar.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Habitacion {

    @Id
    private int idHabitacion;

    private String tipoHabitacion;
    private String estado;

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Habitacion(int idHabitacion, String tipoHabitacion, String estado) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.estado = estado;
    }

    public Habitacion() {
    }
}
