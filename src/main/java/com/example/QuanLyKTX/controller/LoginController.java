package com.example.QuanLyKTX.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.QuanLyKTX.model.User;
import com.example.QuanLyKTX.service.AuthenticationService;
import com.example.QuanLyKTX.model.SessionManager;

@Controller
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password, Model model) {
        User user = authenticationService.authenticate(username, password);
        if (user != null) {
            SessionManager.login(user); // Lưu thông tin người dùng vào SessionManager
            System.out.println("User Information : ");
            System.out.println(user);
            if ("admin".equals(user.getRole())) // Corrected role comparison
            return "redirect:/admin";

            return "redirect:/"; // Nếu xác thực thành công, chuyển hướng đến trang chính
        } else {
            return "rediect:/login"; // Nếu xác thực không thành công, hiển thị lại trang đăng nhập với thông báo lỗi
        }
    }

    @GetMapping("/logout")
    public String logout() {
        SessionManager.logout(); // Xóa thông tin người dùng khi đăng xuất
        return "redirect:/login";
    }

}
