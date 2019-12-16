/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foretella;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 *
 * @author HP
 */
public class Foretella extends Application {
    private TableView table = new TableView();
    @Override
    public void start(Stage primaryStage) { 
        
        primaryStage.setTitle("FORETELLA");

        Button button1 = new Button("FORETELLA");
        Button button2 = new Button("AVERAGE");

        HBox hbox = new HBox(button1, button2);
        hbox.setSpacing(50);
        hbox.setAlignment(Pos.CENTER);
        button1.setMinHeight(40.0);
        button1.setMinWidth(70.0);
        button1.setFont(javafx.scene.text.Font.font(STYLESHEET_CASPIAN, FontWeight.LIGHT, 14.0));
        button2.setMinHeight(40.0);
        button2.setMinWidth(70.0);
        button2.setFont(javafx.scene.text.Font.font(STYLESHEET_CASPIAN, FontWeight.LIGHT, 14.0));

        Scene scene = new Scene(hbox, 500, 450);
        primaryStage.setScene(scene);
        
        button1.setOnAction(e ->{
            /*System.out.println("foretella.Foretella.start()");
            Forecast forecast = new Forecast();
            primaryStage.getScene().setRoot(forecast.getRootPane());*/
            
            
                TextField tf = new TextField();
                tf.setMinWidth(300.0);
                tf.setPromptText("Enter Value");
                //secondaryLayout.setAlignment(Pos.BASELINE_CENTER);               
                //secondaryLayout.getChildren().add(tf); 
                
                Button btn = new Button("Start");
                //btn.setText("Start");
                //secondaryLayout.getChildren().add(btn); 
                
                HBox hb = new HBox(tf, btn);                          
                hb.setAlignment(Pos.BASELINE_LEFT);
                hb.setSpacing(10);
                hb.setPadding(new Insets(10));
                //hb.setMargin(hb, new Insets(0, 0, 40, 0));
                                
                TableColumn year = new TableColumn("Year");
                TableColumn result = new TableColumn("Result");
                
                table.getColumns().addAll(year, result);

                final VBox vbox = new VBox();
                vbox.setSpacing(5);
                //vbox.setPadding(new Insets(40, 10, 10, 10)); 
                //vbox.setMargin(hb, new Insets(0, 0, 0, 0));
                HBox.setMargin(vbox, new Insets(50, 0, 0, 0));
                vbox.getChildren().addAll(table);
                
                
                
                StackPane secondaryLayout = new StackPane();
                Scene secondScene = new Scene(secondaryLayout, 480, 420);
                secondaryLayout.getChildren().addAll(hb, vbox);
                
                // New window (Stage)
                Stage newWindow = new Stage();
                newWindow.setTitle("FORETELLA");
                newWindow.setScene(secondScene);
 
                // Set position of second window, related to primary window.
                newWindow.setX(primaryStage.getX() + 200);
                newWindow.setY(primaryStage.getY() + 100);
 
                newWindow.show();
            
        });
        
        primaryStage.show();
    } 
  
    public static void main(String args[]) 
    { 
        // launch the application 
        launch(args); 
    }
    
}
