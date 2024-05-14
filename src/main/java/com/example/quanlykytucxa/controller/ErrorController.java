package com.example.quanlykytucxa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Xử lý logic của bạn ở đây
        return "error"; // forward đến trang error tương ứng
    }
}
