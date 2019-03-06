/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import javafx.stage.Stage;

/**
 *
 * @author jrodriguezar
 */
public class singleton {
    private static singleton singleton = null;
    private Stage stage;
    
    public static singleton getSingleton(){
        if (singleton == null) {
            singleton = new singleton();
        }
        return singleton;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}