package ru.ugnenko.ugnenko_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField massInput;

    @FXML
    private Label tonnesOutput;

    @FXML
    void Button(ActionEvent event) {
        try {
            double massInKilograms = Double.parseDouble(massInput.getText());
            int tonnes = (int) (massInKilograms / 1000);
            tonnesOutput.setText(String.valueOf(tonnes));
        } catch (NumberFormatException e){
            tonnesOutput.setText("Некорректный ввод");
        }

    }
}

