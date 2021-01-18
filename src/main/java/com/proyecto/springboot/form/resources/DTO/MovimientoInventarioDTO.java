package com.proyecto.springboot.form.resources.DTO;

import lombok.Data;

@Data
public class MovimientoInventarioDTO {
    private Long id;
    private Long fkMovimientoSucesor;
    private Long fkMovimientoPredecesor;
}
