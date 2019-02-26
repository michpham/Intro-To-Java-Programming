/*
Name: Michael Pham
Date: 01/25/2019
Instructor: Rachel Hurt
Program: Bean Machine
*/
package Exercise_14_29;
import ToolKit.BeanMachinePane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Exercise_14_29 extends Application 
{

    @Override
    public void start(Stage primaryStage) {

        BeanMachinePane pane = new BeanMachinePane();

        System.out.println(pane.getWidth());
        Scene scene = new Scene(pane, pane.getW(), pane.getH());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bean Machine");
        primaryStage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
}