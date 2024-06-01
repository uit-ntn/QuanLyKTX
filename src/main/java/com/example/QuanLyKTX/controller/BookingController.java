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
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import com.example.QuanLyKTX.model.Booking;
import com.example.QuanLyKTX.model.Building;
import com.example.QuanLyKTX.model.MonthlyBookingCount;
import com.example.QuanLyKTX.model.Room;
import com.example.QuanLyKTX.service.BookingService;
import com.example.QuanLyKTX.service.RoomService;
import com.example.QuanLyKTX.service.BuildingService;

@Controller
public class BookingController {
    private BookingService bookingService;
    private RoomService roomService;
    private BuildingService buildingService;

    public BookingController(BookingService bookingService, RoomService roomService, BuildingService buildingService) {
        this.bookingService = bookingService;
        this.roomService = roomService;
        this.buildingService = buildingService;
    }

    @GetMapping("/booking/index")
    public String Booking(Model model) {
        List<Room> rooms = roomService.getAllRooms();
        List<Building> buildings = buildingService.getAllBuildings();
        model.addAttribute("rooms", rooms);
        model.addAttribute("buildings", buildings);

        for (Building building : buildings) {
            building.toString();
        }
        return "booking";
    }
    @GetMapping("/booking/rooms")
    public String getRooms(
            @RequestParam String buildingtype,
            @RequestParam int capacity,
            @RequestParam Long building,
            Model model) {
        List<Room> rooms = roomService.findRoomsByCriteria(buildingtype, capacity, building);
        model.addAttribute("rooms", rooms);
        model.addAttribute("buildingtype", buildingtype);
        model.addAttribute("capacity", capacity);
        model.addAttribute("building", building);
    
        List<Building> buildings = buildingService.getAllBuildings();
        model.addAttribute("buildings", buildings);
    
        if (rooms.isEmpty()) {
            model.addAttribute("message", "Không có phòng phù hợp.");
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
