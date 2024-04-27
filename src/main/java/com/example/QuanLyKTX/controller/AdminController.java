package com.example.QuanLyKTX.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.QuanLyKTX.service.UserService;
@Controller
public class AdminController {


    // @Autowired
    // public AdminController(UserService userService) {
    //     this.userService = userService;
    // }


    @GetMapping("/admin")
    public String showAdminPage() {
        return "/admin"; // Trả về tên của file JSP hoặc HTML đại diện cho trang đăng nhập
    }

}
