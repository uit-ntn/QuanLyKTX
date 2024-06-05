package com.example.QuanLyKTX.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.QuanLyKTX.service.UserService;
import com.example.QuanLyKTX.model.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/user/profile")
    public String profile(Model model) {
        User user = userService.getLoggedInUser();
        if (user != null) {
            Student student = userService.getStudentByUser(user);
            model.addAttribute("user", user);
            model.addAttribute("student", student);
        }
        return "user";
    }

}
