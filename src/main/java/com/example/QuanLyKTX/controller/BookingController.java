package com.example.QuanLyKTX.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import com.example.QuanLyKTX.model.Booking;
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
}
