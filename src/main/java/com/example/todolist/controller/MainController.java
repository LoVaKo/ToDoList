package com.example.todolist;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onStartButtonClick() {
        welcomeText.setText("Welcome to To Do List!");
    }
}