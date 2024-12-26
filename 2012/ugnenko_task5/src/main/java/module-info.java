module ru.ugnenko.ugnenko_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ugnenko.ugnenko_task5 to javafx.fxml;
    exports ru.ugnenko.ugnenko_task5;
}