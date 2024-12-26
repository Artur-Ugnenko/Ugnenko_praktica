package ru.ugnenko.ugnenko_task2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.ugnenko.ugnenko_task2.util.Manager.showSecondStage;

public class three {

    @FXML
    private Button BackB;

    @FXML
    private Button Cancel;

    @FXML
    void BackB(ActionEvent event) {
        showSecondStage("begyn-view.fxml", "Marathon Skills 2016");

    }

    @FXML
    void Cancel(ActionEvent event) {
        showSecondStage("two.fxml", "Marathon Skills 2016 - Register as a runner");

    }

}

