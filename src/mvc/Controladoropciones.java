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
public class Controladoropciones {
    private Opcionesventana opciones;
    private Modelo modelo;

    public Controladoropciones(Modelo modelo) {
        this.modelo = modelo;
        this.opciones = new Opcionesventana();
        this.opciones.getIrentrada().setOnAction(new Eventoboton1());
        this.opciones.getIrsalida().setOnAction(new Eventoboton2());
    }
    
    class Eventoboton1 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Controladorvista entrada = new Controladorvista(modelo);
            entrada.mostrarVista();
        }
    }
    
    class Eventoboton2 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Controladorsalida salida = new Controladorsalida(modelo);
            salida.mostrarVista();
        }
    }
    
    public void mostrarVista(){
        singleton Singleton = singleton.getSingleton();
        this.opciones.mostrar(Singleton.getStage());
    }
}
