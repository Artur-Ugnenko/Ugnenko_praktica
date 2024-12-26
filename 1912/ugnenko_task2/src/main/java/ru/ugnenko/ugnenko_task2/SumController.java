package ru.ugnenko.ugnenko_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label Labol;

    @FXML
    private TextField aTextField;

    @FXML
    void Button(ActionEvent event) {
        double number = Double.parseDouble(aTextField.getText().toString());
            double result;
            if(number > 0){
                result = number - 8;
            } else {
                result = number + 6;
            }
            Labol.setText("Результат:" + result);

    }

}
