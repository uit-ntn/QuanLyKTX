package com.example.QuanLyKTX.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingController {
    @GetMapping("/booking")
    public String home() {
        return "booking"; // Trả về tên của file JSP (không cần phần mở rộng .jsp)
    }
}
