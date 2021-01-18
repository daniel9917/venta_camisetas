package com.proyecto.springboot.form.resources.DTO;

import lombok.Data;

@Data
public class ImagenEstampaDTO {
    private int id;
    private Long fkEstampado;
    private String rutaGardada;
}
