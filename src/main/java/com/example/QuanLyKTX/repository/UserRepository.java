package com.example.QuanLyKTX.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.QuanLyKTX.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username); // Tìm user bằng username

    User findByEmail(String email); // Tìm user bằng email

    User findById(int id);
}
