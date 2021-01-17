package com.proyecto.springboot.form.model;

import javax.persistence.*;

@Entity
@Table(name = "estampado")
public class Estampado {
    @Column(name = "nombre")
    private String nombre;

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha_registro")
    private java.sql.Date fechaRegistro;

    @Column(name = "disponible_venta")
    private Boolean disponibleVenta;

    @Column(name = "id_tema")
    private Long idTema;

    @Column(name = "id_usuario")
    private Long idUsuario;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public java.sql.Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(java.sql.Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Boolean getDisponibleVenta() {
        return this.disponibleVenta;
    }

    public void setDisponibleVenta(Boolean disponibleVenta) {
        this.disponibleVenta = disponibleVenta;
    }

    public Long getIdTema() {
        return this.idTema;
    }

    public void setIdTema(Long idTema) {
        this.idTema = idTema;
    }

    public Long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
}
