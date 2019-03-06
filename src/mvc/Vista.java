package mvc;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jrodriguezar
 */
public class Vista extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        Button b1 = new Button("Start");
        Button b2 = new Button("End");

        HBox hbox = new HBox();

        /*FileInputStream input= new FileInputStream("elvaino.jpg");
        Image image = new Image(input);*/
        GridPane gridpane = new GridPane();
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(20);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(30);

        gridpane.getColumnConstraints().addAll(col1, col2, col2, col1);
        Label text = new Label("Enter Address");
        gridpane.add(text, 0, 0, 4, 1);
        GridPane.setHalignment(text, HPos.CENTER);
        Label direccion = new Label("Nombre");
        gridpane.add(direccion, 0, 1, 1, 1);
        GridPane.setHalignment(direccion, HPos.RIGHT);
        TextField txtDireccion = new TextField();
        gridpane.add(txtDireccion, 1, 1, 4, 1);
        Label direccion2 = new Label("Direccion");
        TextField txtDireccion2 = new TextField();
        gridpane.add(direccion2, 0, 2, 1, 2);
        GridPane.setHalignment(direccion2, HPos.RIGHT);
        gridpane.add(txtDireccion2, 1, 2, 4, 2);

        String nombre = null;
        String direction = null;

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Izi,  registrado");
                txtDireccion.getText();
                txtDireccion2.getText();
            }
        });

        //vbox.getChildren().add(gridpane);
        //vbox.getChildren().add(b2);
        hbox.getChildren().add(gridpane);

        vbox.getChildren().add(hbox);
        vbox.getChildren().add(b1);

        Scene scene = new Scene(vbox, 300, 100);
        primaryStage.setTitle("Holi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
