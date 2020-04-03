package com.myelibrary.library.services.implementation;

import com.myelibrary.library.model.Student;
import com.myelibrary.library.repository.StudentRepository;
import com.myelibrary.library.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//Press ⌥⌘U to open a UML class diagram in a popup window.

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findAllById(Iterable<Long> studentId) {
        return studentRepository.findAllById(studentId);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteInBatch(Iterable<Long> studentId) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Student getOneStudent(Long studentId) {
        return studentRepository.getOne(studentId);
    }
}
