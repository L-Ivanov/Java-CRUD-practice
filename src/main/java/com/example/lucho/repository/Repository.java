package com.example.lucho.repository;

import com.example.lucho.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Student, Long> {


}
