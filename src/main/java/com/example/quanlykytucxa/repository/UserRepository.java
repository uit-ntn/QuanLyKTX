package com.example.quanlykytucxa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quanlykytucxa.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Optional<User> findByLoginAndPassword(String login, String password);
    // User save(User user);
    // User save(User user);

    User findByUsername(String username); // Tìm user bằng username

    User findByEmail(String email); // Tìm user bằng email
}

