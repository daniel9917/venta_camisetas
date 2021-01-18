package com.proyecto.springboot.form.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "imagen_estampa")
public class ImagenEstampa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ruta_gardada")
    private String rutaGardada;

    @Column(name = "fk_estampado")
    private Long fkEstampado;
}
