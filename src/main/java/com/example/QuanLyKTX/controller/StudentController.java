package com.example.QuanLyKTX.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import com.example.QuanLyKTX.model.Student;
import com.example.QuanLyKTX.service.StudentService;


@Controller
public class StudentController {
    private StudentService studentService = null;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/api/students", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

}
