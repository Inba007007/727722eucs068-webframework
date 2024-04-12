package com.example.two.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.two.model.Student;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentContoller {
    @GetMapping("/path")
    public Student getMethodName() {
        return new Student("Nithish",20);
    }
    
}
