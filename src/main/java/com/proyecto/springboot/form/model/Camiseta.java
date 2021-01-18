package com.proyecto.springboot.form.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "camiseta")
public class Camiseta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha_registro", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
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
}
