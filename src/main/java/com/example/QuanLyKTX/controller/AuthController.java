package com.example.QuanLyKTX.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/auth")
    public String showLoginForm() {
        return "auth"; // Trả về tên của file JSP hoặc HTML đại diện cho trang đăng nhập
    }
}
