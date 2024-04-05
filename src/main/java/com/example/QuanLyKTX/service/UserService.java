package com.example.QuanLyKTX.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyKTX.model.entity.User;
import com.example.QuanLyKTX.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    // public User findByUsername(String username) {
    // return userRepository.findByUsername(username); // Tìm user bằng username
    // }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email); // Tìm user bằng email
    }


    // public User registerUser(String login, String userName, String email, String
    // password) {
    // if (login != null && password != null) {
    // User user = new User();
    // user.setLogin(login);
    // user.setEmail(email);
    // user.setUsername(userName);
    // user.setPassword(password);
    // return userRepository.save(user);
    // } else {
    // return null;
    // }
    // }

    // public User authenticate(String login, String password) {
    // return userRepository.findByLoginAndPassword(login, password).orElse(null);
    // }
}