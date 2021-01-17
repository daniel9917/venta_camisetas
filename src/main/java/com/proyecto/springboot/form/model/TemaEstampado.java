package com.proyecto.springboot.form.model;

import javax.persistence.*;

@Entity
@Table(name = "tema_estampado")
public class TemaEstampado {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
