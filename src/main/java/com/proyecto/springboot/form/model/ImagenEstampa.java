package com.proyecto.springboot.form.model;

import javax.persistence.*;

@Entity
@Table(name = "imagen_estampa")
public class ImagenEstampa {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "ruta_gardada")
    private String rutaGardada;

    @Column(name = "fk_estampado")
    private Long fkEstampado;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRutaGardada() {
        return this.rutaGardada;
    }

    public void setRutaGardada(String rutaGardada) {
        this.rutaGardada = rutaGardada;
    }

    public Long getFkEstampado() {
        return this.fkEstampado;
    }

    public void setFkEstampado(Long fkEstampado) {
        this.fkEstampado = fkEstampado;
    }
}
