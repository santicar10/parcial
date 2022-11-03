package com.example.demo2.service;
import com.example.demo2.model.Cliente;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public interface ModelFactoryControllerServicio {
        void crearCliente(TextField nombre, TextField edad);
        ArrayList<Cliente> getClientes();
        Cliente buscarCliente(String name);
    }


