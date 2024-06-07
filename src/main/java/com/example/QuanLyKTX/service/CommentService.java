package com.example.QuanLyKTX.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyKTX.model.Comment;
import com.example.QuanLyKTX.repository.CommentRepository;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }
    
    public void AddComment(Comment comment){
        commentRepository.save(comment);
    }

}
