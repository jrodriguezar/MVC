package mvc;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author jrodriguezar
 */
public class Controladorvista {
    private Entrada entrada;
    private Modelo modelo;

    public Controladorvista(Modelo modelo) {
        this.modelo = modelo;
        this.entrada = new Entrada();
        this.entrada.getListar().setOnAction(new Eventobotonlis());
        this.entrada.getNombre().setOnAction(new Eventotext1());
        this.entrada.getDireccion().setOnAction(new Eventotext2());
        this.entrada.getGuardado().setOnAction(new Eventobotonad());
    }
    
    public void mostrarVista(){
        singleton Singleton = singleton.getSingleton();
        this.entrada.mostrar(Singleton.getStage());
    }
    
    class Eventobotonlis implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Controladorsalida salida = new Controladorsalida(modelo);
            salida.mostrarVista();
        }
    }
    
    class Eventotext1 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Controladorsalida salida = new Controladorsalida(modelo);
            salida.mostrarVista();
        }
    }
    
    class Eventotext2 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Controladorsalida salida = new Controladorsalida(modelo);
            salida.mostrarVista();
        }
    }
    
    class Eventobotonad implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            entrada.getNombre().getText();
            
            
        }
    }
}
