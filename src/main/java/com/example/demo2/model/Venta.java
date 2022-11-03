package com.example.demo2.model;
import java.time.LocalDate;

public class Venta {

    private int numVenta;
    private LocalDate fecha;
    private Cliente cliente;
    private DetalleVenta detalleVenta[];

    public Venta(int numVenta, LocalDate fecha, Cliente cliente, DetalleVenta[] detalleVenta) {
        this.numVenta = numVenta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.detalleVenta = detalleVenta;
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DetalleVenta[] getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(DetalleVenta[] detalleVenta) {
        this.detalleVenta = detalleVenta;
    }
}
