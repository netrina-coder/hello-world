package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label text1;
    @FXML
    private TextField bField;
    @FXML
    private TextField step;
    @FXML
    private TextField end;
    @FXML
    private TextField begin;
    @FXML
    private Label welcomeText;
    Tabulate tabulate;
    Point point;
    int stepCount;
    public void initialize (){
    tabulate= new Tabulate();


    }

    private void init () {
        double a = Double.parseDouble(begin.getText());
        double b = Double.parseDouble(end.getText());
        double h = Double.parseDouble(step.getText());
        double b1 = Double.parseDouble(bField.getText());
        stepCount = tabulate.calculateStepCount(a, b, h);
        point = new Point(stepCount);
        point.setX(tabulate.createXArray(a,b,h));
        point.setY(tabulate.createYArray(b1,point.getX()));
    }

    public void onCountButtonClick(ActionEvent actionEvent) {
        init ();
    text1.setText("кількість кроків табуляції="+stepCount);

    }
}