package com.myelibrary.library.services.implementation;

import com.myelibrary.library.model.Student;
import com.myelibrary.library.repository.StudentRepo;
import com.myelibrary.library.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepo studentRepo;

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }
}
