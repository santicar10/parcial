package com.example.demo2.controller;

import com.example.demo2.model.Cliente;
import com.example.demo2.service.ModelFactoryControllerServicio;
import com.example.demo2.service.Store;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ModelFactoryContrller implements ModelFactoryControllerServicio {

    Store store;

    private static class singleton{
        private final static ModelFactoryContrller instancia = new ModelFactoryContrller();
    }

    public static ModelFactoryContrller getInstance(){
        return singleton.instancia;
    }


    public void crearCliente(String nombre, String edad) {
        Store.getClienteService().crearCliente(nombre,edad);
    }

    @Override
    public void crearCliente(TextField nombre, TextField edad) {

    }

    @Override
    public ArrayList<Cliente> getClientes() {
        return Store.getClienteService().getClientes();
    }

    @Override
    public Cliente buscarCliente(String name) {
        return Store.clienteService.buscarCliente(name);
    }
}
