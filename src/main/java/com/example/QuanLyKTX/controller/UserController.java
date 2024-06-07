package com.example.QuanLyKTX.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.QuanLyKTX.service.InvoiceService;
import com.example.QuanLyKTX.service.UserService;
import com.example.QuanLyKTX.model.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    private final UserService userService;

        private InvoiceService invoiceService;


    public UserController(UserService userService, InvoiceService invoiceService) {
        this.userService = userService;
        this.invoiceService = invoiceService;
    }

    @GetMapping("/user/profile")
    public String profile(Model model) {
        User user = userService.getLoggedInUser();
        if (user != null && !"admin".equals(user.getRole())) {
            Student student = userService.getStudentByUser(user);
            List<Invoice> invoices = invoiceService.getInvoicesByStudentID(student.getStudentID());
            model.addAttribute("invoices", invoices);
            model.addAttribute("user", user);
            model.addAttribute("student", student);
            System.out.println(user);
            System.out.println(student);
        }
        return "user";
    }

}
