module ru.ugnenko.ugnenko_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ugnenko.ugnenko_task3 to javafx.fxml;
    exports ru.ugnenko.ugnenko_task3;
}