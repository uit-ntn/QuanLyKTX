package com.example.QuanLyKTX.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.example.QuanLyKTX.model.SessionManager;
import com.example.QuanLyKTX.model.User;
import com.example.QuanLyKTX.service.CommentService;
import com.example.QuanLyKTX.model.Comment;

@Controller
public class HomeController {
    private CommentService commentService;

    public HomeController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/")
    public String Home(Model model) {
        User loggedUser = SessionManager.getLoggedInUser();
        model.addAttribute("loggedUser", loggedUser);
        return "home"; // Trả về tên của file JSP (không cần phần mở rộng .jsp)
    }

    @PostMapping("/comment")
    public ResponseEntity AddComment(@RequestParam Long StudentID, @RequestParam String message) {
        LocalDate createdDate = LocalDate.now();
        // Định dạng ngày tháng năm
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("studentID :" + StudentID);
        System.out.println("message :" + message);
        System.out.println("createdDate : " + createdDate);

        try {
            Comment comment = new Comment(createdDate, message, StudentID);
            commentService.AddComment(comment);

            return ResponseEntity.ok("");

        } catch (Exception e) {
            // Trả về mã lỗi và thông điệp lỗi cho người dùng
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while adding the comment.");
        }

    }

}
