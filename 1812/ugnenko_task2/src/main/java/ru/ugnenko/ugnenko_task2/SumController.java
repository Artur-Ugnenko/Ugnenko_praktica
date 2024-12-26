package ru.ugnenko.ugnenko_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label resultOutput;

    @FXML
    private TextField secondsInput;

    @FXML
    void Button(ActionEvent event) {
        try{
            int totalSeconds = Integer.parseInt(secondsInput.getText());
            int secondsSinceLastMinute = totalSeconds % 60;
            resultOutput.setText(String.valueOf(secondsSinceLastMinute));

        } catch (NumberFormatException e){
            resultOutput.setText("Некорректный ввод");
        }
    }

}
