package com.brainacad.learningManagementSystem.service;

import com.brainacad.learningManagementSystem.dto.Course;
import com.brainacad.learningManagementSystem.dto.Teacher;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by go-go-hamster on 10/16/2016.
 */
public class ManageCourses {
    private Map<Integer, Course> courseMap = new HashMap<>();

    public void addCourse(String name, Teacher teacher, String description) {
        Course course = new Course(name, description, teacher);
        courseMap.put(course.getId(),course);
    }

    public void printCourse(Integer id) {
        System.out.println(courseMap.get(id).getDescription());
    }

    public void printAllCoursesNames () {
        for(int i = 0; i > courseMap.size(); i++) {
            System.out.println();
        }
        for (Map.Entry<Integer, Course> entry : courseMap.entrySet())
        {
            Course value = entry.getValue();
            
        }
    }

}
