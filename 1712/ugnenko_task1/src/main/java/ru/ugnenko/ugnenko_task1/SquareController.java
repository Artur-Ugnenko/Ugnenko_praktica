package ru.ugnenko.ugnenko_task1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SquareController {

    @FXML
    private TextField sideInput;

    @FXML
    private Label resultLabel;

    @FXML
    private void calculateArea() {
        double a = Double.parseDouble(sideInput.getText()); // Получаем значение стороны
        double area = a * a; // Вычисляем площадь
        resultLabel.setText("Площадь квадрата: " + area); // Отображаем результат
    }
}