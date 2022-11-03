package com.example.demo2.service;

import com.example.demo2.model.Cliente;

import java.util.ArrayList;

public interface ClienteService {
    void crearCliente(String nombre, String edad);
    ArrayList<Cliente> getClientes();
    Cliente buscarCliente(String nombre);
}
