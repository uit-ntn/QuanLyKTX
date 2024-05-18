package com.example.QuanLyKTX.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.QuanLyKTX.service.AdminService;


@Controller
public class AdminController {

    private AdminService adminService = null;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/admin")
    public String showAdminPage() {
        return "/admin"; // Trả về tên của file JSP hoặc HTML đại diện cho trang đăng nhập
    }
}
