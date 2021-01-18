package com.proyecto.springboot.form.resources.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class PersonaDTO {
    private Long id;
    private String apellidoCompleto;
    private String email;
    private java.sql.Date fechaNacimiento;
    private Date fechaRegistro;
    private String nombreCompleto;
}
