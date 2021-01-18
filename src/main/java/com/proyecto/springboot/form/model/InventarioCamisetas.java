package com.proyecto.springboot.form.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "inventario_camisetas")
public class InventarioCamisetas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha_registro", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date fechaRegistro;

    @Column(name = "id_camiseta")
    private Long idCamiseta;

    @Column(name = "id_estado")
    private Long idEstado;
}
