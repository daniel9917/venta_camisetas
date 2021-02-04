package com.proyecto.springboot.form.resources.DTO;

import com.proyecto.springboot.form.model.Camiseta;
import com.proyecto.springboot.form.model.Estampado;
import com.proyecto.springboot.form.model.Talla;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CamisetaDTO implements Serializable {
    private int id;
    private Date fechaRegistro = new Date();
    private String nombre;
    private String descripcion;
    private Talla fkTalla;
    private Estampado fkEstampado;
    private Boolean habilitada;
}
