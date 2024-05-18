package com.example.QuanLyKTX.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Students")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentID")
    private Long studentID;
    
    @Column(name = "Fullname")
    private String fullname;
    
    @Column(name = "Gender")
    private String gender;
    
    @Column(name = "DateOfBirth")
    private Date dateOfBirth;
    
    @Column(name = "Address")
    private String address;
    
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    
    @Column(name = "RoomID")
    private Long roomID;
    
    @Column(name = "School")
    private String school;
    
    @Column(name = "MSSV")
    private String mssv;

    // Constructors, getters, and setters
    public Student() {
    }

    public Student(String fullname, String gender, Date dateOfBirth, String address, String phoneNumber, Long roomID, String school, String mssv) {
        this.fullname = fullname;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.roomID = roomID;
        this.school = school;
        this.mssv = mssv;
    }

    // Getters and setters
    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getRoomID() {
        return roomID;
    }

    public void setRoomID(Long roomID) {
        this.roomID = roomID;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", fullname='" + fullname + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", roomID=" + roomID +
                ", school='" + school + '\'' +
                ", mssv='" + mssv + '\'' +
                '}';
    }
}

