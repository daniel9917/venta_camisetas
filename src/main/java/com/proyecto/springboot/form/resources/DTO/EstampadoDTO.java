package com.proyecto.springboot.form.resources.DTO;

import lombok.Data;
import java.sql.Date;

@Data
public class EstampadoDTO {
    private int id;
    private String nombre;
    private String descripcion;
    private Date fechaRegistro;
    private Boolean disponibleVenta;
    private Long idTema;
    private Long idUsuario;
}
