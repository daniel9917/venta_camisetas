package com.proyecto.springboot.form.model;

import javax.persistence.Entity;

@Entity
public class Imagen_Estampa {
	
	private int id;
	private String ruta;
	private int estampado;
	
	public Imagen_Estampa() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public int getEstampado() {
		return estampado;
	}

	public void setEstampado(int estampado) {
		this.estampado = estampado;
	}
	
	
	

}
