package com.proyecto.springboot.form.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Venta_Camiseta {

	private int id;
	private Date fecha_venta;
	private Date fecha_registro;
	private int id_vendedor;
	private int id_cliente;
	private int id_camiseta;
	private int id_forma_pago;
	
	public Venta_Camiseta() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(Date fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public int getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(int id_vendedor) {
		this.id_vendedor = id_vendedor;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_camiseta() {
		return id_camiseta;
	}

	public void setId_camiseta(int id_camiseta) {
		this.id_camiseta = id_camiseta;
	}

	public int getId_forma_pago() {
		return id_forma_pago;
	}

	public void setId_forma_pago(int id_forma_pago) {
		this.id_forma_pago = id_forma_pago;
	}
	
	
	
}
