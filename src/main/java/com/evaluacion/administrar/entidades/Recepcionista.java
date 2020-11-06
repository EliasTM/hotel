package com.evaluacion.administrar.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recepcionista {

    @Id
    private int idRecepcionista;
    private int dni;
    private String nombre;
    private String apellido;
    private int idRol;
    private int idHabitacion;

    public int getIdRecepcionista() {
        return idRecepcionista;
    }

    public void setIdRecepcionista(int idRecepcionista) {
        this.idRecepcionista = idRecepcionista;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Recepcionista(int idRecepcionista, int dni, String nombre, String apellido, int idRol, int idHabitacion) {
        this.idRecepcionista = idRecepcionista;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.idRol = idRol;
        this.idHabitacion = idHabitacion;
    }

    public Recepcionista() {
    }
}
