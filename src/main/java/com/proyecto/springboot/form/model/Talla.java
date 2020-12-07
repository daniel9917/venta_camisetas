package com.proyecto.springboot.form.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Talla {
	
	private int ID;
	private Date fecha_registro;
	private String nombre;
	private int representacion_numerica;
	private boolean habilitado;
	
	public Talla() {
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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

	public int getRepresentacion_numerica() {
		return representacion_numerica;
	}

	public void setRepresentacion_numerica(int representacion_numerica) {
		this.representacion_numerica = representacion_numerica;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	
	
	
}
