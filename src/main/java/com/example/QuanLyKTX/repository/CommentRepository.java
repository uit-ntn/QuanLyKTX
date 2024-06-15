package com.example.QuanLyKTX.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.QuanLyKTX.model.Cart;
import com.example.QuanLyKTX.model.Comment;


@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
        Cart findByStudentID(Long studentID);
    
}