module ru.ugnenko.ugnenko_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ugnenko.ugnenko_task2 to javafx.fxml;
    exports ru.ugnenko.ugnenko_task2;
}