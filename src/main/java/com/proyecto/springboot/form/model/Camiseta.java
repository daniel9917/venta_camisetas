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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Talla getFkTalla() {
		return fkTalla;
	}

	public void setFkTalla(Talla fkTalla) {
		this.fkTalla = fkTalla;
	}

	public Estampado getFkEstampado() {
		return fkEstampado;
	}

	public void setFkEstampado(Estampado fkEstampado) {
		this.fkEstampado = fkEstampado;
	}

	public Boolean getHabilitada() {
		return habilitada;
	}

	public void setHabilitada(Boolean habilitada) {
		this.habilitada = habilitada;
	}
    
    
}
