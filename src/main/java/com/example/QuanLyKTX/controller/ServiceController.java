package com.example.QuanLyKTX.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ServiceController {
    @GetMapping("Services")
    public String Service() {
        return "service";
    }
    
}
