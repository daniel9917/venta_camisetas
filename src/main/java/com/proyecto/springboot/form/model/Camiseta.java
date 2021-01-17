package com.proyecto.springboot.form.model;

import javax.persistence.*;

@Entity
@Table(name = "camiseta")
public class Camiseta {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha_registro")
    private java.sql.Date fechaRegistro;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fk_talla")
    private Long fkTalla;

    @Column(name = "fk_estampado")
    private Long fkEstampado;

    @Column(name = "habilitada")
    private Boolean habilitada;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.sql.Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(java.sql.Date fechaRegistro) {
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

    public Long getFkTalla() {
        return this.fkTalla;
    }

    public void setFkTalla(Long fkTalla) {
        this.fkTalla = fkTalla;
    }

    public Long getFkEstampado() {
        return this.fkEstampado;
    }

    public void setFkEstampado(Long fkEstampado) {
        this.fkEstampado = fkEstampado;
    }

    public Boolean getHabilitada() {
        return this.habilitada;
    }

    public void setHabilitada(Boolean habilitada) {
        this.habilitada = habilitada;
    }
}
