package com.proyecto.springboot.form.model;

import lombok.Data;
import java.util.Date;
import javax.persistence.*;

@Data
@Entity
@Table(name = "camiseta")
public class Camiseta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "fecha_registro", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date fechaRegistro;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "fk_talla")
    private Talla fkTalla;

    @ManyToOne
    @JoinColumn(name = "fk_estampado")
    private Estampado fkEstampado;

    @Column(name = "habilitada")
    private Boolean habilitada;
}
