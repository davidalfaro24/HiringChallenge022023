package com.mx.accenture.springmvc.example.dto;

import com.mx.accenture.springmvc.example.model.Course;

import java.io.Serializable;
import java.util.List;

public class StudentDTO implements Serializable {
    private int id;
    private String name;
    private List<Course> listOfCourses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getListOfCourses() {
        return listOfCourses;
    }

    public void setListOfCourses(List<Course> listOfCourses) {
        this.listOfCourses = listOfCourses;
    }
}


