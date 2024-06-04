package com.example.QuanLyKTX.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyKTX.model.User;
import com.example.QuanLyKTX.repository.UserRepository;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Isolation;

@Service
public class UserService {
    private final UserRepository userRepository;

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


    public Optional<User> authenticate(String username, String password) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(password)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
