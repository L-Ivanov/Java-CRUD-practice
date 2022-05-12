package com.example.lucho.services;

import com.example.lucho.entities.Student;
import com.example.lucho.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private Repository repository;

    public StudentServiceImpl(Repository repository) {
        this.repository = repository;
    }


    @Override
    public Student saveStudent(Student student) {
        return this.repository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return this.repository.findAll();
    }

    @Override
    public String changeEmail(String email) {
        Student student = new Student();
        if(!student.getEmail().equals(email)){
            student.setEmail(email);
        }
        return "Email successfully changed";

    }
    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }



}

