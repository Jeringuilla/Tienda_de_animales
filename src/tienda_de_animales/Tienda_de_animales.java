
package tienda_de_animales;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Tienda_de_animales extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pantalla objeto_pantalla = new Pantalla();
        objeto_pantalla.setVisible(true);
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
