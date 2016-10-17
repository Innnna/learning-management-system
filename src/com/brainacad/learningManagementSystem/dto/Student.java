package com.brainacad.learningManagementSystem.dto;

import java.util.List;

/**
 * Created by go-go-hamster on 9/20/2016.
 */
public class Student extends Human {


    private List<String> tasks;

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }
}
