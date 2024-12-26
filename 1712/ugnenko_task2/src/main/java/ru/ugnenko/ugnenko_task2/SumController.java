package ru.ugnenko.ugnenko_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label dLabel;

    @FXML
    private Label lLabel;

    @FXML
    private TextField sTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        double S=Float.parseFloat(sTextField.getText().toString());
        double pi=3.14;
        double d= Math.sqrt(4*S/pi);
        double l = pi * d;
        dLabel.setText(String.format("Диаметр d=%.2f", d));
        lLabel.setText(String.format("Длина l=%.2f", l));
    }

}
