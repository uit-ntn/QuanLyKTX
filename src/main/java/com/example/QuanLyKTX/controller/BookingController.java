package com.example.QuanLyKTX.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;
import com.example.QuanLyKTX.model.Booking;
import com.example.QuanLyKTX.model.MonthlyBookingCount;
import com.example.QuanLyKTX.model.Student;
import com.example.QuanLyKTX.model.Room;
import com.example.QuanLyKTX.service.BookingService;
import com.example.QuanLyKTX.service.RoomService;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class BookingController {
    private BookingService bookingService;
    private RoomService roomService;

    public BookingController(BookingService bookingService, RoomService roomService) {
        this.bookingService = bookingService;
        this.roomService = roomService;
    }

    @GetMapping("/booking/index")
    public String getAllBookings(Model model) throws JsonProcessingException {
        List<Booking> bookings = bookingService.getAllBookings();
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(bookings);

        System.err.println(json);
        model.addAttribute("bookingsJson", json);

        return "booking";
    }

    // Thay đổi đường dẫn này để tránh xung đột
    @GetMapping("/booking/room-list")
    public String RoomList(Model model) {
        try {
            List<Room> rooms = roomService.getAllRooms();
            model.addAttribute("rooms", rooms);
            System.out.println(rooms);
              } catch (Exception e) {

            e.printStackTrace();
            model.addAttribute("errorMessage", "An error occurred while fetching rooms");
        }
        return "roomList";
    }

    
    @PostMapping("/api/bookings")
    public ResponseEntity<Booking> addBooking(@RequestBody Booking booking) {
        Booking savedBooking = bookingService.saveBooking(booking);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBooking);
    }

    @GetMapping("/api/bookings/{bookingId}")
    public ResponseEntity<Booking> getBookingById(@PathVariable Long bookingId) {
        Booking booking = bookingService.findById(bookingId);
        return ResponseEntity.ok(booking);
    }

    @PutMapping("/api/bookings/{bookingId}")
    public ResponseEntity<Booking> updateBooking(@PathVariable Long bookingId, @RequestBody Booking updatedBooking) {
        Booking booking = bookingService.updateBooking(bookingId, updatedBooking);
        if (booking == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(booking);
    }

     @DeleteMapping("/api/bookings/{bookingId}")
    public ResponseEntity<Void> deleteBooking(@PathVariable Long bookingId) {
        boolean isDeleted = bookingService.deleteBooking(bookingId);
        if (!isDeleted) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/bookings/count")
    public ResponseEntity<Long> getTotalBookings() {
        long totalBookings = bookingService.countBookings();
        return ResponseEntity.ok(totalBookings);
    }

    @GetMapping("/api/bookings/bookings-per-month")
    public ResponseEntity<List<MonthlyBookingCount>> getMonthlyBookings() {
        List<MonthlyBookingCount> monthlyBookings = bookingService.getMonthlyBookingCounts();
        return ResponseEntity.ok(monthlyBookings);
    }

    
}
