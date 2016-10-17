package com.brainacad.learningManagementSystem.dto;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by go-go-hamster on 10/16/2016.
 */
public class Gradebook {
    private Map <Student, Map<Task, Double>> gradebook = new HashMap<>();

    public Map<Student, Map<Task, Double>> getGradebook() {
        return gradebook;
    }

    public void setGradebook(Map<Student, Map<Task, Double>> gradebook) {
        this.gradebook = gradebook;
    }
}
