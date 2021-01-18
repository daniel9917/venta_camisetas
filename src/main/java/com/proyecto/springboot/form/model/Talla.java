package com.proyecto.springboot.form.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "talla")
public class Talla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha_registro", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date fechaRegistro;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "representacion_numerica")
    private int representacionNumerica;

    @Column(name = "habilitado")
    private Boolean habilitado;
}
