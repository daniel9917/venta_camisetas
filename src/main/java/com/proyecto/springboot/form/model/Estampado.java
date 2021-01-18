package com.proyecto.springboot.form.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "estampado")
public class Estampado {

    @Column(name = "nombre")
    private String nombre;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha_registro", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private java.sql.Date fechaRegistro;

    @Column(name = "disponible_venta")
    private Boolean disponibleVenta;

    @Column(name = "id_tema")
    private Long idTema;

    @Column(name = "id_usuario")
    private Long idUsuario;
}
