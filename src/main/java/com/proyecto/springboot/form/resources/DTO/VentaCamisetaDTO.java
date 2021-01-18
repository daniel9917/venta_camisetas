package com.proyecto.springboot.form.resources.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class VentaCamisetaDTO {
    private Long id;
    private Date fechaRegistro;
    private Date fechaVenta;
    private Long fkCamiseta;
    private Long fkCliente;
    private Long fkFormaPago;
    private Long fkVendedor;
}
