package com.example.todolist.controller;

import com.example.todolist.Task;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

public class TaskManager {

    @FXML
    private static final ObservableList<Task> taskList = FXCollections.observableArrayList();

    public static ObservableList<Task> getTaskList() {
        return taskList;
    }

    public static void addTask(Task task) {
        taskList.add(task);
    }
}
