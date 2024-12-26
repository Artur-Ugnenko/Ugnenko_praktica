module ru.ugnenko.ugnenko_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ugnenko.ugnenko_task4 to javafx.fxml;
    exports ru.ugnenko.ugnenko_task4;
}