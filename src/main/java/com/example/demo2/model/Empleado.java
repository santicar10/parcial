package com.example.demo2.model;

public class Empleado extends Persona{
    private int salario =0;

    public Empleado(String nombre, String id, String celular, String email, int salario) {
        super(nombre, id, celular, email);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
