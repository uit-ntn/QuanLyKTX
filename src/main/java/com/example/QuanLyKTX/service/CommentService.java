package com.example.QuanLyKTX.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyKTX.model.Comment;
import com.example.QuanLyKTX.repository.CommentRepository;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void saveComment(String message, Long studentID) {
        Comment comment = new Comment(LocalDate.now(), message, studentID);
        commentRepository.save(comment);
    }
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

}
