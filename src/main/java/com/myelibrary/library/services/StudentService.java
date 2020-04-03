package com.myelibrary.library.services;

import com.myelibrary.library.model.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);

    List<Student> findAllById(Iterable<Long> studentId);

    List<Student> findAll();

    void deleteInBatch(Iterable<Long> studentId);

    void deleteAllInBatch();

    Student getOneStudent(Long studentId);
}
