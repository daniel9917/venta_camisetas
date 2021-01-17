package com.proyecto.springboot.form.model;

import javax.persistence.*;

@Entity
@Table(name = "forma_pago")
public class FormaPago {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "impuesto")
    private double impuesto;

    @Column(name = "descripcion")
    private String descripcion;

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

    public double getImpuesto() {
        return this.impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
