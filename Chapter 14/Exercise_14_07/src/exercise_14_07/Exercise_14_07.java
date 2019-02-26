/*
Name: Michael Pham
Date: 01/22/2019
Instructor: Rachel Hurt
Program: Display images
*/
package exercise_14_07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class Exercise_14_07 extends Application 
{
    
    @Override
    public void start(Stage primaryStage) 
    {
        // Creates a GridPane and sets its properties
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        pane.setHgap(5);
        pane.setVgap(5);
        
        // Randomly generates 0s and 1s and places them in a centered text field
        for(int x = 0; x < 10; x++) // rows
        {
            for(int y = 0; y < 10; y++) // columns
            {
                TextField text = new TextField();
                text.setText(String.valueOf((int)(Math.random() * 2)));
                pane.add(text, x, y);
                text.setPrefColumnCount(1);
            }
        }
        
        // Creates scene and plane it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise_14_07"); // stage title
        primaryStage.setScene(scene); // places scene in stage
        primaryStage.show(); // displays stage
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
