/*
Name: Michael Pham
Date: 01/22/2019
Instructor: Rachel Hurt
Program: Display images
*/
package exercise_14_11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Polygon;

public class Exercise_14_11 extends Application {
    
    @Override
    public void start(Stage primaryStage) 
    {
        Pane pane = new Pane();
        
        // Creates head
        Circle circle1 = new Circle();
        circle1.setCenterX(100);
        circle1.setCenterY(100);
        circle1.setRadius(90);
        circle1.setStroke(Color.BLACK);
        circle1.setFill(Color.WHITE);       
        pane.getChildren().add(circle1);
        
        // Creates elipses
        Ellipse e1 = new Ellipse(135, 75, 24, 17);
        e1.setStroke(Color.BLACK);
        e1.setFill(Color.TRANSPARENT);
        pane.getChildren().add(e1);
        
        Ellipse e2 = new Ellipse(65, 75, 24, 17);
        e2.setStroke(Color.BLACK);
        e2.setFill(Color.TRANSPARENT);
        pane.getChildren().add(e2);
        
        Circle circle2 = new Circle();
        circle2.setCenterX(135);
        circle2.setCenterY(75);
        circle2.setRadius(10);
        circle2.setStroke(Color.BLACK);
        circle2.setFill(Color.BLACK);       
        pane.getChildren().add(circle2);
        
        Circle circle3 = new Circle();
        circle3.setCenterX(65);
        circle3.setCenterY(75);
        circle3.setRadius(10);
        circle3.setStroke(Color.BLACK);
        circle3.setFill(Color.BLACK);       
        pane.getChildren().add(circle3);
        
        Polygon triangle = new Polygon();
        double length = circle1.getRadius() / 4;
        triangle.getPoints().addAll(new Double[]{
         circle1.getCenterX(), circle1.getCenterY() - length,
			circle1.getCenterX() - length, circle1.getCenterY() + length, circle1.getCenterX() + length, 
			circle1.getCenterY() + length
         });
        triangle.setFill(Color.TRANSPARENT);
        triangle.setStroke(Color.BLACK);
        pane.getChildren().add(triangle);
        
        Arc arc = new Arc(
                circle1.getCenterX(),
                circle1.getCenterY() + (circle1.getRadius() / 3),
                circle1.getRadius() / 2,
                circle1.getRadius() / 2 / 2, 180, 180);
        arc.setFill(Color.TRANSPARENT);
        arc.setStroke(Color.BLACK);
        pane.getChildren().add(arc);
        
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("ShowCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
