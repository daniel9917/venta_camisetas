package com.proyecto.springboot.form.model;

import javax.persistence.*;

@Entity
@Table(name = "movimiento_inventario")
public class MovimientoInventario {
    @Id
    @Column(name = "id")
    private Long id;

    @Id
    @Column(name = "fk_movimiento_predecesor")
    private Long fkMovimientoPredecesor;

    @Id
    @Column(name = "fk_movimiento_sucesor")
    private Long fkMovimientoSucesor;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFkMovimientoPredecesor() {
        return this.fkMovimientoPredecesor;
    }

    public void setFkMovimientoPredecesor(Long fkMovimientoPredecesor) {
        this.fkMovimientoPredecesor = fkMovimientoPredecesor;
    }

    public Long getFkMovimientoSucesor() {
        return this.fkMovimientoSucesor;
    }

    public void setFkMovimientoSucesor(Long fkMovimientoSucesor) {
        this.fkMovimientoSucesor = fkMovimientoSucesor;
    }
}
