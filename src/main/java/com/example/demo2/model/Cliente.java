package com.example.demo2.model;

public class Cliente extends Persona{

    private static final String nombre = "";
    private static final String celular = "";
    private static final String email = "";
    private static final String id = "";
    private String direccion;

    public Cliente() {
        super(nombre, id, celular, email);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
