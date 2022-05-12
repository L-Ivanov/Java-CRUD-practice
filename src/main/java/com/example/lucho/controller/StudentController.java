package com.example.lucho.controller;

import com.example.lucho.entities.Student;
import com.example.lucho.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;

    }
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        this.studentService.saveStudent(student);
        return "Student Successfully added";
    }
    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return this.studentService.getAllStudents();

    }
    @PutMapping("/{email}")
    public String change(@PathVariable String email){
        this.studentService.changeEmail(email);
        return "The email has been changed";
    }


    @DeleteMapping(value = "/student/{id}")
    @ResponseBody
    public String deletePost(@PathVariable Long id) {
        studentService.delete(id);
        return "User deleted";
    }

}
