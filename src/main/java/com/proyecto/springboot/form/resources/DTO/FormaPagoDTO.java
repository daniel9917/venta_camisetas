package com.proyecto.springboot.form.resources.DTO;

import lombok.Data;

@Data
public class FormaPagoDTO {
    private int id;
    private String descripcion;
    private double impuesto;
    private String nombre;
}
