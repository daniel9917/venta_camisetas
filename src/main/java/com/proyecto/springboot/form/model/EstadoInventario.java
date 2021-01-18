package com.proyecto.springboot.form.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "estado_inventario")
public class EstadoInventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;
}
