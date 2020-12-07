package com.proyecto.springboot.form.model;

import java.io.Serial;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Camiseta {
	
	private int id;
	private Date fecha_registro;
	private String nombre;
	private String descripcion;
	private int id_talla;
	private int id_estampado;
	private boolean habilitado;
	
	public Camiseta() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
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
	public int getId_talla() {
		return id_talla;
	}
	public void setId_talla(int id_talla) {
		this.id_talla = id_talla;
	}
	public int getId_estampado() {
		return id_estampado;
	}
	public void setId_estampado(int id_estampado) {
		this.id_estampado = id_estampado;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

}
