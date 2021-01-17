package com.proyecto.springboot.form.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre_completo")
    private String nombreCompleto;

    @Column(name = "apellido_completo")
    private String apellidoCompleto;

    @Column(name = "fecha_nacimiento")
    private java.sql.Date fechaNacimiento;

    @Column(name = "email")
    private String email;

    @Column(name = "fecha_registro")
    private Date fechaRegistro;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getApellidoCompleto() {
        return this.apellidoCompleto;
    }

    public void setApellidoCompleto(String apellidoCompleto) {
        this.apellidoCompleto = apellidoCompleto;
    }

    public java.sql.Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(java.sql.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
