package com.mx.accenture.springmvc.example.dao;

import com.mx.accenture.springmvc.example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentReponsitory extends JpaRepository<Student, Integer> {
}
