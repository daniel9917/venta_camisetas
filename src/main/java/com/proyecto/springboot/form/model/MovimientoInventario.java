package com.proyecto.springboot.form.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "movimiento_inventario")
public class MovimientoInventario implements Serializable {
    @Id
    @Column(name = "id")
    private Long id;

    @Id
    @Column(name = "fk_movimiento_predecesor")
    private Long fkMovimientoPredecesor;

    @Id
    @Column(name = "fk_movimiento_sucesor")
    private Long fkMovimientoSucesor;
}
