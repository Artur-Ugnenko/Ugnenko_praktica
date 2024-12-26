package ru.ugnenko.ugnenko_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label dayOfWeekOutput;

    @FXML
    private TextField dayOfYearInput;

    @FXML
    void Button(ActionEvent event) {
        try {
            int dayOfYear = Integer.parseInt(dayOfYearInput.getText());
            if (dayOfYear < 1 || dayOfYear > 365) {
                dayOfWeekOutput.setText("Некорректный ввод");
                return;
            }

            int dayOfWeek = (dayOfYear + 2) % 7;
            String dayName;
            switch (dayOfWeek){
                case 1 : dayName = "Понедельник"; break;
                case 2 : dayName = "Вторник"; break;
                case 3 : dayName = "Среда"; break;
                case 4 : dayName = "Четверг"; break;
                case 5 : dayName = "Пятница"; break;
                case 6 : dayName = "Суббота"; break;
                case 7 : dayName = "Воскресенье"; break;
                default: dayName = "Ошибка";
            }
            dayOfWeekOutput.setText(dayName);

        } catch (NumberFormatException e) {
            dayOfWeekOutput.setText("Некорректный ввод");
        }
    }

}
