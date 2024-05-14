package com.example.QuanLyKTX.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.QuanLyKTX.model.User;
import com.example.QuanLyKTX.service.UserService;

@Controller
public class AuthController {
    private UserService userService = null;

    @Autowired
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/auth")
    public String showLoginForm(Model model) {
        model.addAttribute("registerRequest", new User());
        return "auth"; // Trả về tên của file JSP hoặc HTML đại diện cho trang đăng nhập
    }

    @PostMapping("/signup")
    public String signup(@RequestParam("username") String username,
            @RequestParam("email") String email,
            @RequestParam("password") String password, Model model) {
        User existingUser = userService.findByEmail(email);
        if (existingUser != null) {
            model.addAttribute("emailExists", true); // Thêm thuộc tính emailExists vào model
            return "auth";
        }
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        userService.save(user);
        // return registeredUser == null ? "error" : "redirect:/login";
        model.addAttribute("createSuccess", true);
        return "/home"; // Chuyển hướng sau khi đăng ký thành công
    }

    @PostMapping("/login")
    public String login(
            @RequestParam("email") String email,
            @RequestParam("password") String password, Model model) {
        System.out.println("login request" + email + password);
        User existingUser = userService.findByEmail(email);
        if (existingUser == null) {
            model.addAttribute("emailLoginExists", true); // Thêm thuộc tính emailExists vào model
            return "auth";
        } else {
            if (userService.authenticate(email, password)) {
                return "/home"; // Chuyển hướng sau khi đăng nhập thành công
            } else {
                model.addAttribute("invalidLogin", true); // Thông báo lỗi nếu đăng nhập không thành
                // công
                return "/auth"; // Trả về lại trang đăng nhập
            }
        }
    }

    // @PostMapping("/login")
    // public String login(@ModelAttribute User user) {
    // System.out.println("login request" + user);
    // User authenticatedUser = userService.authenticate(user.getLogin(),
    // user.getPassword());
    // if (authenticatedUser != null) {
    // return "home";
    // } else {
    // return "error";
    // }
    // }

}
