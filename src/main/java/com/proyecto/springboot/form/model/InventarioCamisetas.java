package com.proyecto.springboot.form.model;

import javax.persistence.*;

@Entity
@Table(name = "inventario_camisetas")
public class InventarioCamisetas {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha_registro")
    private java.sql.Date fechaRegistro;

    @Column(name = "id_camiseta")
    private Long idCamiseta;

    @Column(name = "id_estado")
    private Long idEstado;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.sql.Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(java.sql.Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Long getIdCamiseta() {
        return this.idCamiseta;
    }

    public void setIdCamiseta(Long idCamiseta) {
        this.idCamiseta = idCamiseta;
    }

    public Long getIdEstado() {
        return this.idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }
}
