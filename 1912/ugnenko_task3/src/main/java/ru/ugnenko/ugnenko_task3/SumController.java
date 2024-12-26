package  ru.ugnenko.ugnenko_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aT;

    @FXML
    private TextField bT;

    @FXML
    private TextField cT;

    @FXML
    private Label zxc;

    @FXML
    void Button(ActionEvent event) {
        try {
            double a = Double.parseDouble(aT.getText());
            double b = Double.parseDouble(bT.getText());
            double c = Double.parseDouble(cT.getText());
            if (a == c) {
                zxc.setText("Уникальное число" + b + "(3-й номер)");
            } else if (a == c) {
                zxc.setText("Уникальное число" + b + "(2-й номер)");
            }
        } catch (NumberFormatException e){
            zxc.setText("Введите корректные целые числа");
        }

    }

}
