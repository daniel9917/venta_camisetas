package com.proyecto.springboot.form.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre_completo")
    private String nombreCompleto;

    @Column(name = "apellido_completo")
    private String apellidoCompleto;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "email")
    private String email;

    @Column(name = "fecha_registro", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp fechaRegistro;
}
