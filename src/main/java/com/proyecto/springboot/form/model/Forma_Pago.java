package com.proyecto.springboot.form.model;

import javax.persistence.Entity;

@Entity
public class Forma_Pago {
	
	private int id;
	private String nombre;	
	private double impuesto;//Porcentaje
	private String text;
		
	public Forma_Pago() {

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

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
						
}
