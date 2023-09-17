package com.example.primeiroprojetojavafx;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField txt1;
    public void onButtonClick(Event e) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Olá " + txt1.getText());
        alert.showAndWait();
    }
}