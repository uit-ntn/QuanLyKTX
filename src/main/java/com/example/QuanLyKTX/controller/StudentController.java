package com.example.QuanLyKTX.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

import com.example.QuanLyKTX.model.Student;
import com.example.QuanLyKTX.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



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

    @PostMapping("api/students")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student savedStudent = studentService.saveStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
    }

    @GetMapping("api/students/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long studentId) {
        Student student = studentService.findById(studentId);
        return ResponseEntity.ok(student);
    }

    @PutMapping("/api/students/{studentId}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long studentId, @RequestBody Student updatedStudent) {
        Student student = studentService.updateStudent(studentId, updatedStudent);
        if (student == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(student);
    }

     @DeleteMapping("/api/students/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long studentId) {
        boolean isDeleted = studentService.deleteStudent(studentId);
        if (!isDeleted) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/students/not-in-booking")
    public ResponseEntity<List<Student>> getStudentsNotInBooking() {
        List<Student> students = studentService.getStudentsNotInBooking();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/api/students/count")
    public ResponseEntity<Long> getTotalStudents() {
        long totalStudents = studentService.countStudents();
        return ResponseEntity.ok(totalStudents);
    }
}
