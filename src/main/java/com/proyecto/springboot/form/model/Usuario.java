package com.proyecto.springboot.form.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha_registro")
    private Date fechaRegistro;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fk_persona")
    private Long fkPersona;

    @Column(name = "fk_rol")
    private Long fkRol;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getFkPersona() {
        return this.fkPersona;
    }

    public void setFkPersona(Long fkPersona) {
        this.fkPersona = fkPersona;
    }

    public Long getFkRol() {
        return this.fkRol;
    }

    public void setFkRol(Long fkRol) {
        this.fkRol = fkRol;
    }
}
