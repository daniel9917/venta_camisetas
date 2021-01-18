package com.proyecto.springboot.form.resources.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class TallaDTO {
    private Long id;
    private Date fechaRegistro;
    private Boolean habilitado;
    private String nombre;
    private Long representacionNumerica;
}
