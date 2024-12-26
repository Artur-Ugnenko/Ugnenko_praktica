package ru.ugnenko.ugnenko_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label Label;

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    void Button(ActionEvent event) {
        float a=Float.parseFloat(aTextField.getText().toString());
        float b=Float.parseFloat(bTextField.getText().toString());
        float x=-(b/a);
        Label.setText(String.format("x=%.2f",x));
    }

}
