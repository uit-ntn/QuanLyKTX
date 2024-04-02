package com.example.QuanLyKTX.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home"; // Trả về tên của file JSP (không cần phần mở rộng .jsp)
    }
}
