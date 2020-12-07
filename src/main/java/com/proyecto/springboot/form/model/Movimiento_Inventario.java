package com.proyecto.springboot.form.model;

public class Movimiento_Inventario {
	
	private int id;
	private int id_movimiento_predecesor;
	private int id_movimiento_sucesor;
	
	public Movimiento_Inventario() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_movimiento_predecesor() {
		return id_movimiento_predecesor;
	}
	public void setId_movimiento_predecesor(int id_movimiento_predecesor) {
		this.id_movimiento_predecesor = id_movimiento_predecesor;
	}
	public int getId_movimiento_sucesor() {
		return id_movimiento_sucesor;
	}
	public void setId_movimiento_sucesor(int id_movimiento_sucesor) {
		this.id_movimiento_sucesor = id_movimiento_sucesor;
	}
	
	

}
