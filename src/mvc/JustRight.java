/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author jrodriguezar
 */
public class JustRight implements EventHandler<ActionEvent>{
    
    private String nombre;
    private String direccion;

    public JustRight(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public void handle(ActionEvent event) {
        System.out.println("IZI, registrado");
    }
}
