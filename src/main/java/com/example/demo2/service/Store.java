package com.example.demo2.service;

import com.example.demo2.service.impl.ClienteImpl;

public interface Store {

    ClienteImpl clienteService = new ClienteImpl();
     static ClienteImpl getClienteService(){
        return clienteService;
    }
}
