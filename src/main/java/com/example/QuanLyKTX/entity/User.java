package com.example.QuanLyKTX.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;
    
    private String email;
    
    private String username;
    
    private String password;
    
    private String role;
    
    @ManyToOne
    @JoinColumn(name = "StudentID")
    private Student student;
    
    @ManyToOne
    @JoinColumn(name = "StaffID")
    private AdminStaff adminStaff;

    public User() {
        // Default constructor
    }

    // Getters and setters
    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public AdminStaff getAdminStaff() {
        return adminStaff;
    }

    public void setAdminStaff(AdminStaff adminStaff) {
        this.adminStaff = adminStaff;
    }
}

