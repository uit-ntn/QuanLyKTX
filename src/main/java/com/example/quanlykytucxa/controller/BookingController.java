package com.example.quanlykytucxa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.quanlykytucxa.entity.Booking;
import com.example.quanlykytucxa.service.BookingService;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BookingController {

    @Autowired
    private BookingService bookingService;


    @GetMapping("/booking")
    public String bookingPage() {
        List<Booking> bookings = bookingService.findAll();
        System.out.println(bookings);

        return "booking";
    }
}
