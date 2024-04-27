package org.example.newexercise;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class HelloApplication extends Application {
    private TextField display;
    private double firstNumber = 0;
    private String operator = "";
    private boolean start = true;


    @Override
    public void start(Stage primaryStage)  {

        display = new TextField();
        display.setEditable(false);
        display.setAlignment(Pos.CENTER_RIGHT);


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));


        grid.add(display, 0, 0, 4, 1);


        //Array of button labels
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        //Create and add buttons to the grid
        int index = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                Button btn = new Button(buttons[index]);
                btn.setPrefWidth(60);
                btn.setPrefHeight(40);
                btn.setOnAction(this::processEvent);
                grid.add(btn, j, i);
                index++;
            }
        }

        primaryStage.setTitle("Four Function Calculator");

        Scene scene = new Scene(grid, 320, 240); //Create a scene with specified size
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Method to process button
    private void processEvent(javafx.event.ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        if ("0123456789".contains(value)) {
            if (start) {
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + value);
        } else if ("/*-+".contains(value)) {
            firstNumber = Double.parseDouble(display.getText());
            operator = value;
            start = true;
        } else if ("=".equals(value)) {
            if (operator.isEmpty()) return;
            display.setText(String.valueOf(calculate(firstNumber, Double.parseDouble(display.getText()), operator)));
            operator = "";
            start = true;
        } else {
            display.setText("");
            operator = "";
            start = true;
        }
    }

    //Calculate the result based on operator
    private double calculate(double a, double b, String operator) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": if (b == 0) return 0; else return a / b;
            default: return 0;
        }
    }



    //Launch the application
    public static void main(String[] args) {
        launch();
    }
}