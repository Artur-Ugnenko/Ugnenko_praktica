package ru.ugnenko.ugnenko_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label Laben;

    @FXML
    private TextField aTextField;

    @FXML
    void Button(ActionEvent event) {
        try{
            int number =
                    Integer.parseInt(aTextField.getText());
            if(number % 10==7){
                Laben.setText("Число оканчивается на 7");
            } else {
                Laben.setText("Число не оканчивается на 7");
            }
        } catch (NumberFormatException e) {
            Laben.setText("Введите корректное число");;
        }

    }

}
