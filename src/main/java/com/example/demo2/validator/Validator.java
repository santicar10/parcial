package com.example.demo2.validator;

import com.example.demo2.model.Cliente;

import java.util.ArrayList;

public class Validator {
    public void verificarCampos(String nombre, String edad) throws Exception{
        if (nombre == null && edad==null){
            throw new Exception("porfavor llene todos los campos");
        }
    }

    public void verificarEdad(String edad) throws Exception{
        try {
            Integer.parseInt(edad);
        }catch (NumberFormatException e){
            throw new Exception("porfsvor ingresar numeros");
        }
    }

    public void arraylist (ArrayList<Cliente> clienteArrayList) throws Exception{
        if (clienteArrayList.size()==0){
            throw new Exception("la lista esta vacia");
        }
    }
}
