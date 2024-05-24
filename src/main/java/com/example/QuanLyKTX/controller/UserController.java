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
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Trả về trang thông tin user
    @GetMapping("/{user_id}/profile")
    public String userProfile(
            @PathVariable("user_id") int userId,
            Model model) {
        User user = userService.findUserById(userId);
        model.addAttribute("user", user);
        return "user";
    }

    @GetMapping("/{user_id}/invoices")
    public String userInvoices(@PathVariable("user_id") String userId) {
        return "invoices";
    }

    @GetMapping("/{user_id}/invoice/{invoice_id}")
    public String userInvoiceDetail(@PathVariable("user_id") Long userId, @PathVariable("invoice_id") Long invoiceId) {
        return "invoiceDetail";
    }

    @GetMapping("/{user_id}/payment")
    public String userPayment(@PathVariable("user_id") String userId) {
        return "payment";
    }

    @GetMapping("/{user_id}/repairs")
    public String userRepairs(@PathVariable("user_id") String userId, @RequestParam String param) {
        return "repairs";
    }

    // Create a new user
    @PostMapping
    public String createUser(@RequestBody String userInfo) {
        // Handle creating a new user with the given userInfo
        return "userCreated";
    }

    // Update user information
    @PutMapping("/{user_id}")
    public String updateUser(@PathVariable("user_id") String userId, @RequestBody String userInfo) {
        // Handle updating user information for the given userId with the given userInfo
        return "userUpdated";
    }

    // Delete a user
    @DeleteMapping("/{user_id}")
    public String deleteUser(@PathVariable("user_id") String userId) {
        // Handle deleting the user with the given userId
        return "userDeleted";
    }

    // List all users
    @GetMapping("/list")
    public String listUsers() {
        // Handle listing all users
        return "userList";
    }
}
