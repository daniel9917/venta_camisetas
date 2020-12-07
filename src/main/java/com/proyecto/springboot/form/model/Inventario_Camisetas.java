package com.proyecto.springboot.form.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Inventario_Camisetas {
	
	private int id;
	private Date fecha_registro;
	private int id_camiseta;
	private int id_estado;

	public Inventario_Camisetas() {

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

	public int getId_camiseta() {
		return id_camiseta;
	}

	public void setId_camiseta(int id_camiseta) {
		this.id_camiseta = id_camiseta;
	}

	public int getId_estado() {
		return id_estado;
	}

	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}
	
	
	
		

}
