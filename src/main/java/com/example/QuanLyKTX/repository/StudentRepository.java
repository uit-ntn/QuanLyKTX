package com.example.QuanLyKTX.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.QuanLyKTX.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // JpaRepository đã cung cấp phương thức findAll(), không cần thêm gì ở đây
}