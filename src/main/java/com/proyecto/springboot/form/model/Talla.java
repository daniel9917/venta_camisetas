package com.proyecto.springboot.form.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "talla")
public class Talla {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha_registro")
    private Date fechaRegistro;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "representacion_numerica")
    private int representacionNumerica;

    @Column(name = "habilitado")
    private Boolean habilitado;

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

    public int getRepresentacionNumerica() {
        return this.representacionNumerica;
    }

    public void setRepresentacionNumerica(int representacionNumerica) {
        this.representacionNumerica = representacionNumerica;
    }

    public Boolean getHabilitado() {
        return this.habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }
}
