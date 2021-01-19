package com.proyecto.springboot.form.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

import javax.persistence.*;

@Data
@Entity
@Table(name = "estampado")
public class Estampado {

    @Column(name = "nombre")
    @Getter
    @Setter
    private String nombre;
    
    

    public Estampado(String nombre, String descripcion, Date fechaRegistro, Long idTema, Long idUsuario) {
		
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaRegistro = fechaRegistro;
		this.idTema = idTema;
		this.idUsuario = idUsuario;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter
    @Setter
    private int id;

    @Column(name = "descripcion")
    @Getter
    @Setter
    private String descripcion;

    @Column(name = "fecha_registro", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Getter
    @Setter
    private java.sql.Date fechaRegistro;

    @Column(name = "disponible_venta")
    @Getter
    @Setter
    private Boolean disponibleVenta;

    @Column(name = "id_tema")
    @Getter
    @Setter
    private Long idTema;

    @Column(name = "id_usuario")
    @Getter
    @Setter
    private Long idUsuario;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public java.sql.Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(java.sql.Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Boolean getDisponibleVenta() {
		return disponibleVenta;
	}

	public void setDisponibleVenta(Boolean disponibleVenta) {
		this.disponibleVenta = disponibleVenta;
	}

	public Long getIdTema() {
		return idTema;
	}

	public void setIdTema(Long idTema) {
		this.idTema = idTema;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
    
    
}
