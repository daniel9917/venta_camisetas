package com.proyecto.springboot.form.model;

import javax.persistence.*;

@Entity
@Table(name = "estampado_raiting")
public class EstampadoRaiting {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "voto")
    private int voto;

    @Column(name = "id_estampado")
    private Long idEstampado;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVoto() {
        return this.voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public Long getIdEstampado() {
        return this.idEstampado;
    }

    public void setIdEstampado(Long idEstampado) {
        this.idEstampado = idEstampado;
    }
}
