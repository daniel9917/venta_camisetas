package com.proyecto.springboot.form.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "venta_camiseta")
public class VentaCamiseta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha_venta")
    private Date fechaVenta;

    @Column(name = "fecha_registro", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date fechaRegistro;

    @Column(name = "fk_vendedor")
    private Long fkVendedor;

    @Column(name = "fk_cliente")
    private Long fkCliente;

    @Column(name = "fk_camiseta")
    private Long fkCamiseta;

    @Column(name = "fk_forma_pago")
    private Long fkFormaPago;
}
