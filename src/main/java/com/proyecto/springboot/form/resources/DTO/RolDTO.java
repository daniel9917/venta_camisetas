package com.proyecto.springboot.form.resources.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class RolDTO {
    private Long id;
    private String descripcion;
    private Date fechaRegistro;
    private String nombre;
}
