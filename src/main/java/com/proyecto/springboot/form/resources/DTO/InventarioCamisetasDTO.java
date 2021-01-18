package com.proyecto.springboot.form.resources.DTO;

import lombok.Data;

@Data
public class InventarioCamisetasDTO {
    private int id;
    private java.sql.Date fechaRegistro;
    private Long idCamiseta;
    private Long idEstado;
}
