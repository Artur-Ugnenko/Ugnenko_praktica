module ru.ugnenko.ugnenko_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ugnenko.ugnenko_task1 to javafx.fxml;
    exports ru.ugnenko.ugnenko_task1;
    exports ru.ugnenko.ugnenko_task1.controller;
    opens ru.ugnenko.ugnenko_task1.controller to javafx.fxml;
}