package com.example.lucho.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;

    }
    public String getEmail(){
        return email;
    }
    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
