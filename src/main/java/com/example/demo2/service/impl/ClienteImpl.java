package com.example.demo2.service.impl;

import com.example.demo2.model.Cliente;
import com.example.demo2.service.ClienteService;
import java.util.ArrayList;

public class ClienteImpl implements ClienteService {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    @Override
    public void crearCliente (String name, String edad){
        clientes.add(new Cliente( name, Integer.parseInt(edad)));
    }

    @Override
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public Cliente buscarCliente(String name){
        for (Cliente cliente:clientes) {
            if (cliente.getNombre() == name ){
                return cliente;
            }
        }
        return null;
    }




}
