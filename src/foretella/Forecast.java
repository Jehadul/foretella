/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foretella;

import javafx.application.Application;
import static javafx.application.Application.STYLESHEET_CASPIAN;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class Forecast extends Application{
    private final BorderPane rootPane ; // or any other kind of pane, or  Group...

    public Forecast() {

        rootPane = new BorderPane();

        // build UI, register event handlers, etc etc

    }

    public Pane getRootPane() {
        return rootPane ;
    }
private int i = 0;
    private GridPane gpnael = new GridPane();
    @Override
    public void start(Stage primaryStage) throws Exception {
       Pane root = new Pane();
        Button button1 = new Button("FORETELLA");
        Button button2 = new Button("AVERAGE");

        HBox hbox = new HBox(button1);
        hbox.setAlignment(Pos.CENTER);
        button1.setMinHeight(40.0);
        button1.setMinWidth(70.0);
        button1.setFont(javafx.scene.text.Font.font(STYLESHEET_CASPIAN, FontWeight.LIGHT, 14.0));
        
        root.getChildren().add(gpnael);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
