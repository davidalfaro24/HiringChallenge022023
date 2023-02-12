package com.mx.accenture.springmvc.example.service;

import com.mx.accenture.springmvc.example.dto.StudentDTO;

import java.util.List;

public class StudentServiceImp implements IStudent{
    @Override
    public List<StudentDTO> listAllStudents() {
        return null;
    }

    @Override
    public StudentDTO findStudentById(int idStudent) {
        return null;
    }

    @Override
    public void addStudent(StudentDTO newStudent) {

    }

    @Override
    public void updateStudent(StudentDTO StudentChange) {

    }

    @Override
    public void deleteStudent(int idStudent) {

    }

    @Override
    public List<StudentDTO> listStudentCourses(int idStudent) {
        return null;
    }
}
