package com.brainacad.learningManagementSystem.dto;

import java.time.LocalDate;

/**
 * Created by go-go-hamster on 9/21/2016.
 */
public class Course {
    private static Integer providerId = 0;
    private Integer id;
    private String name;
    private String description;
    private Teacher teacher;
    private Student[] students;//todo
    private LocalDate startDate;

    public enum Schedule {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};

    public Course() {
        id = providerId++;
    }

    public Course(String name, String description, Teacher teacher) {
        this();
        this.name = name;
        this.description = description;
        this.teacher = teacher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
