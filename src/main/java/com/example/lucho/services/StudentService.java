package com.example.lucho.services;

import com.example.lucho.entities.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public String changeEmail(String email);
    public void delete(Long id);

}
