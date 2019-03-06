package mvc;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author jrodriguezar
 */
public class Controladorsalida {
    private Salida salida;
    private Modelo modelo;

    public Controladorsalida(Modelo modelo) {
        this.modelo = modelo;
        this.salida = new Salida();
        this.salida.getRegreso().setOnAction(new Eventoboton());
    }
    
    public void mostrarVista(){
        singleton Singleton = singleton.getSingleton();
        this.salida.mostrar(Singleton.getStage());
    }
    
    class Eventoboton implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Controladoropciones opciones = new Controladoropciones(modelo);
            opciones.mostrarVista();
        }
    }
}
