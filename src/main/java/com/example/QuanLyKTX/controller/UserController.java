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
    public String UserAccount() {
        return "user";
    }
    

    // @PostMapping("/login")
    // public String loginUser(@RequestParam("userName") String userName,
    //         @RequestParam("password") String password,
    //         Model model) {
    //     User user = userService.findByUsername(userName);

    //     if (user != null && user.getPassword().equals(password)) {
    //         SessionManager.login(user);
    //         return "redirect:/";
    //     } else {
    //         model.addAttribute("loginError", "Invalid username or password");
    //         return "auth"; // Return to the login page with an error message
    //     }
    // }

    // @RequestMapping("/logout")
    // public String logout() {
    //     SessionManager.logout();
    //     return "redirect:/auth"; // Redirect to the login page after logout
    // }

}
