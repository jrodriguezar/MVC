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
 * @author Jhon
 */
public class Entrada /*extends Application*/{
    
    private Scene scene;
    private GridPane grid;
    private Text scenetitle;
    private ListView<String> list;
    private Button guardado;
    private Button listar;
    private HBox hbox;
    private HBox hbox1;
    private VBox vbox1;
    private VBox vbox;
    private TextField nombre;
    private TextField direccion;
    private TableView tabla;
    private ObservableList tipos;

    /*@Override
    public void start(Stage primaryStage) throws Exception {
        vbox = new VBox();
        
        Menu menu = new Menu("Menu 1");
        MenuItem menuItem1 = new
        MenuItem("Item 1");
        MenuItem menuItem2 = new
        MenuItem("Item 2");
        menu.getItems().add(menuItem1);
        menu.getItems().add(menuItem2);
        Menu menu2 = new Menu("Menu 2");
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);
        menuBar.getMenus().add(menu2);
        
        hbox = new HBox();
        hbox.setAlignment(Pos.BOTTOM_LEFT);
        hbox.getChildren().add(menuBar);
        vbox.getChildren().add(hbox);
        
        grid = new GridPane();
        Label name = new Label("Nombre");
        grid.add(name, 0, 1, 1, 1);
        GridPane.setHalignment(name, HPos.RIGHT);
        nombre = new TextField();
        grid.add(nombre, 1, 1, 5, 1);
        Label direccion2 = new Label("Direccion");
        direccion = new TextField();
        grid.add(direccion2, 0, 2, 1, 2);
        GridPane.setHalignment(direccion2, HPos.RIGHT);
        grid.add(direccion, 1, 2, 5, 2);
        vbox.getChildren().add(grid);
        
        hbox1 = new HBox();
        guardado = new Button("Adicionar");
        listar = new Button("Listar");
        vbox1 = new VBox();
        vbox1.setAlignment(Pos.CENTER);
        tipos = FXCollections.observableArrayList();
        tipos.add("Claro");
        tipos.add("Movistar");
        tipos.add("Avantel");
        tipos.add("Virgin");
        ChoiceBox cb = new ChoiceBox(tipos);
        vbox1.getChildren().add(cb);
        hbox1.setAlignment(Pos.BOTTOM_CENTER);
        hbox1.getChildren().add(guardado);
        hbox1.getChildren().add(listar);
        vbox.getChildren().add(vbox1);
        vbox.getChildren().add(hbox1);
        
        scene = new Scene(vbox, 250 , 200);
        primaryStage.setTitle("Interfaz");
        primaryStage.setScene(scene);
        primaryStage.show();
    }*/
    
    public Entrada(){
        vbox = new VBox();
        
        Menu menu = new Menu("Menu 1");
        MenuItem menuItem1 = new
        MenuItem("Item 1");
        MenuItem menuItem2 = new
        MenuItem("Item 2");
        menu.getItems().add(menuItem1);
        menu.getItems().add(menuItem2);
        Menu menu2 = new Menu("Menu 2");
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);
        menuBar.getMenus().add(menu2);
        
        hbox = new HBox();
        hbox.setAlignment(Pos.BOTTOM_LEFT);
        hbox.getChildren().add(menuBar);
        vbox.getChildren().add(hbox);
        
        grid = new GridPane();
        Label name = new Label("Nombre");
        grid.add(name, 0, 1, 1, 1);
        GridPane.setHalignment(name, HPos.RIGHT);
        nombre = new TextField();
        grid.add(nombre, 1, 1, 5, 1);
        Label direccion2 = new Label("Direccion");
        direccion = new TextField();
        grid.add(direccion2, 0, 2, 1, 2);
        GridPane.setHalignment(direccion2, HPos.RIGHT);
        grid.add(direccion, 1, 2, 5, 2);
        vbox.getChildren().add(grid);
        
        hbox1 = new HBox();
        guardado = new Button("Adicionar");
        listar = new Button("Listar");
        vbox1 = new VBox();
        vbox1.setAlignment(Pos.CENTER);
        tipos = FXCollections.observableArrayList();
        tipos.add("Claro");
        tipos.add("Movistar");
        tipos.add("Avantel");
        tipos.add("Virgin");
        ChoiceBox cb = new ChoiceBox(tipos);
        vbox1.getChildren().add(cb);
        hbox1.setAlignment(Pos.BOTTOM_CENTER);
        hbox1.getChildren().add(guardado);
        hbox1.getChildren().add(listar);
        vbox.getChildren().add(vbox1);
        vbox.getChildren().add(hbox1);
        
        scene = new Scene(vbox, 250 , 200);
    }
    
    public void mostrar(Stage stage){
        stage.setTitle("Entrada");
        stage.setScene(scene);
        stage.show();
    }
    
    /*public static void main(String[] args) {
        Application.launch(args);
    }*/

    public Button getListar() {
        return listar;
    }

    public TextField getNombre() {
        return nombre;
    }

    public TextField getDireccion() {
        return direccion;
    }

    public Button getGuardado() {
        return guardado;
    }
}