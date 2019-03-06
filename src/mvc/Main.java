/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author jrodriguezar
 */
public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Registrar la variable en el singleton
        singleton Singleton = singleton.getSingleton();
        Singleton.setStage(primaryStage);
        
        //Modelo en memoria
        Modelo modelo = new Modelo();
        //invocar el controlado de una vista para visaulzar
        Controladorvista entrada = new Controladorvista(modelo);
        //hacer que la ventana se muestre graficamente
        entrada.mostrarVista();
        
        /*Controladorsalida salida = new Controladorsalida(modelo);
        salida.mostrarVista();*/
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
