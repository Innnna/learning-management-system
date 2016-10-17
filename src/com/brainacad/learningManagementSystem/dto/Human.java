package com.brainacad.learningManagementSystem.dto;

import java.util.List;

/**
 * Created by go-go-hamster on 10/16/2016.
 */
public class Human {
    private static Integer providerID;
    private Integer id;
    private String firstName;
    private String lastName;
    private List<String> courses;

    public Human() {
        id = providerID++;
    }

    public Human(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}
