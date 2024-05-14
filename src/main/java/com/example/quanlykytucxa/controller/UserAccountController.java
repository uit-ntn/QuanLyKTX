package com.example.quanlykytucxa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserAccountController {
    @GetMapping("/user/{id}")
    public String UserAccount(@PathVariable("id") String id) {
        return "userProfile"; // Trả về tên của file JSP (không cần phần mở rộng .jsp)
    }
}
