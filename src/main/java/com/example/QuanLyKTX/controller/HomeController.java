package com.example.QuanLyKTX.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.QuanLyKTX.model.SessionManager;
import com.example.QuanLyKTX.model.User;

@Controller
public class HomeController {
    @GetMapping("/")
    public String Home(Model model) {
        User loggedUser = SessionManager.getLoggedInUser();
        model.addAttribute("loggedUser", loggedUser);
        return "home"; // Trả về tên của file JSP (không cần phần mở rộng .jsp)
    }
}
