package com.example.QuanLyKTX.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyKTX.model.SessionManager;
import com.example.QuanLyKTX.model.Student;
import com.example.QuanLyKTX.model.User;
import com.example.QuanLyKTX.repository.StudentRepository;
import com.example.QuanLyKTX.repository.UserRepository;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Isolation;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    private StudentRepository studentRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        System.out.println("Saving user: " + user);
        return userRepository.save(user);
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getLoggedInUser() {
        return SessionManager.getLoggedInUser();
    }

    public Student getStudentByUser(User user) {
        return studentRepository.findById(user.getStudentID()).orElse(null);
    }

}
