package com.proyecto.springboot.form.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "venta_camiseta")
public class VentaCamiseta {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha_venta")
    private Date fechaVenta;

    @Column(name = "fecha_registro")
    private Date fechaRegistro;

    @Column(name = "fk_vendedor")
    private Long fkVendedor;

    @Column(name = "fk_cliente")
    private Long fkCliente;

    @Column(name = "fk_camiseta")
    private Long fkCamiseta;

    @Column(name = "fk_forma_pago")
    private Long fkFormaPago;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaVenta() {
        return this.fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Long getFkVendedor() {
        return this.fkVendedor;
    }

    public void setFkVendedor(Long fkVendedor) {
        this.fkVendedor = fkVendedor;
    }

    public Long getFkCliente() {
        return this.fkCliente;
    }

    public void setFkCliente(Long fkCliente) {
        this.fkCliente = fkCliente;
    }

    public Long getFkCamiseta() {
        return this.fkCamiseta;
    }

    public void setFkCamiseta(Long fkCamiseta) {
        this.fkCamiseta = fkCamiseta;
    }

    public Long getFkFormaPago() {
        return this.fkFormaPago;
    }

    public void setFkFormaPago(Long fkFormaPago) {
        this.fkFormaPago = fkFormaPago;
    }
}
