package com.proyecto.springboot.form.resources.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class UsuarioDTO {
    private int id;
    private String descripcion;
    private Date fechaRegistro;
    private Long fkPersona;
    private Long fkRol;
    private String nombre;
}
