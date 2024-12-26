package ru.ugnenko.ugnenko_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label Label;

    @FXML
    private TextField sideInput;

    @FXML
    void calculateButton(ActionEvent event) {
        double A=Double.parseDouble(sideInput.getText().toString());
    Label.setText("Площадь = "+ (A * A));
    }

}
