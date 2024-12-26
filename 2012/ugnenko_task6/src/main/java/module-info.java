module ru.ugnenko.ugnenko_task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ugnenko.ugnenko_task6 to javafx.fxml;
    exports ru.ugnenko.ugnenko_task6;
}