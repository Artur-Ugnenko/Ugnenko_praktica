package ru.ugnenko.ugnenko_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField kField;

    @FXML
    private Label resultLabel;

    @FXML
    private TextField xField;

    @FXML
    void Button(ActionEvent event) {
        try {
            int k = Integer.parseInt(kField.getText());
            double x = Double.parseDouble(xField.getText());
            double y = calculateY(k, x);

            if (Double.isNaN(y)) {
                resultLabel.setText("Значение y не определено");
                showAlert("Ошибка", "Значение y не определено для введенных k.");
            } else {
                resultLabel.setText("Результат: " + String.format("%.2f", y));
            }

        } catch (NumberFormatException e) {
            resultLabel.setText("Неверный формат ввода");
            showAlert("Ошибка", "Пожалуйста, введите корректные числа.");
        }
    }

    private void showAlert(String ошибка, String s) {
    }

    private double calculateY(int k, double x) {
        switch (k) {
            case 3:
                return Math.sin(x) + 2;
            case 20:
                return Math.pow(Math.cos(x), 2);
            case 10:
            case 15:
                return Math.tan(x) + Math.sin(x) * Math.sin(x);
            default:
                return Double.NaN;
        }
    }

  

    }

