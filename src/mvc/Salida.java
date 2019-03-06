package mvc;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Jhon
 */
public class Salida extends Application{
    
    private Scene scene;
    
    private GridPane grid;
    private Text scenetitle;
    
    private ListView<String> list;
    
    private Button regreso;
    private HBox hbox;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        scenetitle = new Text("Lista: ");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        list = new ListView<>();
        list.setMinWidth(200);
        grid.add(list, 0, 1);
        
        regreso = new Button("Regresar");
        
        hbox = new HBox(10);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.getChildren().add(regreso);
        grid.add(hbox, 0, 2);
        
        scene = new Scene(grid, 300 , 300);
        primaryStage.setTitle("Lista");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public Salida() {
        //Layout
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        scenetitle = new Text("Holi");
        grid.add(scenetitle, 0, 0, 2, 1);
        
        list = new ListView<>();
        list.setMinWidth(200);
        grid.add(list, 0, 1);
        
        regreso = new Button("Regresar");
        
        hbox = new HBox(10);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.getChildren().add(regreso);
        grid.add(hbox, 0, 2);
        
        scene = new Scene(grid, 300 , 300);
    }
    
    public void mostrar(Stage stage){
        stage.setTitle("Holi");
        stage.setScene(scene);
        stage.show();
    }
    
    public ListView<String> getList(){
        return list;
    }

    public Button getRegreso() {
        return regreso;
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
