package com.example.todolist;

import static com.example.todolist.controller.TaskManager.addTask;

public class Task {
    private final String description;
    private boolean isCompleted;


    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
        addTask(this);
    }

    public void complete() {
        this.isCompleted = true;
    }


}
