package com.proyecto.springboot.form.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "forma_pago")
public class FormaPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "impuesto")
    private double impuesto;

    @Column(name = "descripcion")
    private String descripcion;
}
