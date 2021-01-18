package com.proyecto.springboot.form.resources.DTO;

import lombok.Data;

@Data
public class EstampadoDTO {
    private int id;
    private String descripcion;
    private Boolean disponibleVenta;
    private java.sql.Date fechaRegistro;
    private Long idTema;
    private Long idUsuario;
    private String nombre;
}
