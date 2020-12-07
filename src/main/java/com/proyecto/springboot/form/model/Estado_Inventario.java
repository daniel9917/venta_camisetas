package com.proyecto.springboot.form.model;

import javax.persistence.Entity;

@Entity
public class Estado_Inventario {
	
	private int id;
	private String nombre;
	
	public Estado_Inventario() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
