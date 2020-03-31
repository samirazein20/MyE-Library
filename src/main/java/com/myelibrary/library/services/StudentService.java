package com.myelibrary.library.services;

import com.myelibrary.library.model.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> findAll();
}
