package com.example.QuanLyKTX.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import com.example.QuanLyKTX.model.Booking;
import com.example.QuanLyKTX.service.BookingService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class BookingController {
    private BookingService bookingService = null;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/booking")
    public String getAllBookings(Model model) throws JsonProcessingException {
        List<Booking> bookings = bookingService.getAllBookings();
        // model.addAttribute("bookings", bookings);

        // for (Booking booking : bookings) {
        // System.err.println("Booking ID: " + booking.getBookingID());
        // System.err.println("Student ID: " + booking.getStudent().getStudentID()); //
        // Assuming student has an getId()
        // System.err.println("Room ID: " + booking.getRoom().getRoomID()); // Assuming
        // room has an getId() method
        // System.err.println("Check-In Date: " + booking.getCheckInDate());
        // System.err.println("Check-Out Date: " + booking.getCheckOutDate());
        // System.err.println("-------------------------");
        // }

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(bookings);

        System.err.println(json);
        model.addAttribute("bookingsJson", json);

        return "booking"; // Trả về tên của file JSP hoặc HTML đại diện cho trang booking
    }

    @GetMapping(value = "/api/bookings", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

}
