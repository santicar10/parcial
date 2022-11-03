package com.example.demo2;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.demo2.controller.ModelFactoryContrller;
import com.example.demo2.model.Cliente;
import com.example.demo2.validator.Validator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    ModelFactoryContrller modelFactoryContrller = new ModelFactoryContrller();
    Validator validator = new Validator();

    Cliente cliente = new Cliente();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button agregar;

    @FXML
    private Label cuadro;

    @FXML
    private TextField edad;

    @FXML
    private Button listar;

    @FXML
    private TextField nombre;

    @FXML
    void initialize() {
        assert agregar != null : "fx:id=\"agregar\" was not injected: check your FXML file 'drgueria.fxml'.";
        assert cuadro != null : "fx:id=\"cuadro\" was not injected: check your FXML file 'drgueria.fxml'.";
        assert edad != null : "fx:id=\"edad\" was not injected: check your FXML file 'drgueria.fxml'.";
        assert listar != null : "fx:id=\"listar\" was not injected: check your FXML file 'drgueria.fxml'.";
        assert nombre != null : "fx:id=\"nombre\" was not injected: check your FXML file 'drgueria.fxml'.";

    }

    @FXML
    void crearCliente(){
        try {
            validator.verificarCampos(nombre.getText(),edad.getText());
            validator.verificarEdad(edad.getText());
            modelFactoryContrller.crearCliente(nombre.getText(),edad.getText());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void mostrarLista(){
        try {
            validator.arraylist(modelFactoryContrller.getClientes());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        StringBuilder lista = new StringBuilder();
        for (Cliente cliente:modelFactoryContrller.getClientes()) {
            lista.append("Nombre: ").append(cliente.getNombre()).append("\n").append("Edad: ").append(cliente.getEdad());
        }
    }

}
