package com.mx.accenture.springmvc.example.service;

import com.mx.accenture.springmvc.example.dto.CourseDTO;
import com.mx.accenture.springmvc.example.dto.StudentDTO;
import com.mx.accenture.springmvc.example.model.Course;

import java.util.List;

public interface IStudent {
    public List<StudentDTO> listAllStudents();
    public StudentDTO findStudentById(int idStudent);
    public void addStudent(StudentDTO newStudent);
    public void updateStudent(StudentDTO StudentChange);
    public void deleteStudent(int idStudent);
    public List<StudentDTO> listStudentCourses (int idStudent);

}
