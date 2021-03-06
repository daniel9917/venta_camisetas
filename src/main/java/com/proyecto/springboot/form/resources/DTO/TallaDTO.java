package com.proyecto.springboot.form.resources.DTO;

import lombok.Data;
import java.util.Date;

@Data
public class TallaDTO {
    private int id;
    private Date fechaRegistro;
    private String nombre;
    private int representacionNumerica;
    private Boolean habilitado;
}
