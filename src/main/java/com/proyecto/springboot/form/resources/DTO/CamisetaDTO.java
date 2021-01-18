package com.proyecto.springboot.form.resources.DTO;

import java.sql.Date;
import lombok.Data;

@Data
public class CamisetaDTO {
    private Long id;
    private String descripcion;
    private Date fechaRegistro;
    private Long fkEstampado;
    private Long fkTalla;
    private Boolean habilitada;
    private String nombre;
}
