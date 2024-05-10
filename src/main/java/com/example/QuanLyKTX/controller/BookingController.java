package com.example.QuanLyKTX.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.QuanLyKTX.repository.StudentRepository;
import com.example.QuanLyKTX.service.BookingService;

@Controller
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @Autowired
private StudentRepository studentRepository;
    
    @GetMapping("/register-room")
    public String showRegistrationForm(Model model) {
        model.addAttribute("rooms", bookingService.getAvailableRooms());
        model.addAttribute("students", studentRepository.findAll());
        return "registration-form";
    }

    @PostMapping("/register-room")
    public String registerRoom(@RequestParam Long studentId, @RequestParam Long roomId, @RequestParam Date checkInDate, @RequestParam Date checkOutDate) {
        bookingService.bookRoom(studentId, roomId, checkInDate, checkOutDate);
        return "redirect:/success";
    }
}
