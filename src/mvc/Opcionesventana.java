package mvc;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 *
 * @author jrodriguezar
 */
public class Opcionesventana {
    
    private Scene scene;
    private Button irentrada;
    private Button irsalida;
    private HBox hbox;

    public Opcionesventana() {
        hbox = new HBox();
        irentrada = new Button("Ir a entrada");
        irsalida = new Button("Ir salida");
        hbox.getChildren().add(irentrada);
        hbox.getChildren().add(irsalida);
        scene = new Scene(hbox, 200, 200);
    }
    
    public void mostrar(Stage stage){
        stage.setTitle("Opciones");
        stage.setScene(scene);
        stage.show();
    }

    public Button getIrentrada() {
        return irentrada;
    }

    public Button getIrsalida() {
        return irsalida;
    }
}
