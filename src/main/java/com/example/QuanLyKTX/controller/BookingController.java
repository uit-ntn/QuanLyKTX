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

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import com.example.QuanLyKTX.model.Booking;
import com.example.QuanLyKTX.model.Building;
import com.example.QuanLyKTX.model.MonthlyBookingCount;
import com.example.QuanLyKTX.model.Room;
import com.example.QuanLyKTX.model.Student;
import com.example.QuanLyKTX.model.User;
import com.example.QuanLyKTX.service.BookingService;
import com.example.QuanLyKTX.service.RoomService;
import com.example.QuanLyKTX.service.StudentService;
import com.example.QuanLyKTX.service.BuildingService;
import com.example.QuanLyKTX.service.UserService;

@Controller
public class BookingController {
    private BookingService bookingService;
    private RoomService roomService;
    private BuildingService buildingService;
    private StudentService studentService;
    private UserService userService;

    public BookingController(BookingService bookingService, RoomService roomService, BuildingService buildingService,
            UserService userService, StudentService studentService) {
        this.bookingService = bookingService;
        this.roomService = roomService;
        this.buildingService = buildingService;
        this.userService = userService;
        this.studentService = studentService;
    }

    // phải có get mapping không có tham số trước rồi mới có get mapping có tham số
    // :v
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        return "registration-form";
    }

    @GetMapping("/register/{roomID}")
    public String showRegistrationForm(@PathVariable Long roomID, Model model) {
        Room room = roomService.findById(roomID); // Tìm phòng bằng roomID
        if (room == null) {
            // Xử lý trường hợp không tìm thấy phòng
            return "error";
        } else {
            model.addAttribute("room", room); // Truyền thông tin phòng vào view
            System.out.println("đã truyền data vào view");
        }
        return "registration-form";
    }

    @PostMapping("booking/register")
    public String register(@RequestParam("roomID") Long roomID,
            @RequestParam("fullName") String fullName,
            @RequestParam("gender") String gender,
            @RequestParam("dateOfBirth") Date dateOfBirth,
            @RequestParam("address") String address,
            @RequestParam("phoneNumber") String phoneNumber,
            @RequestParam("school") String school,
            @RequestParam("mssv") String mssv,
            @RequestParam("email") String email,
            @RequestParam("checkInDate") Date checkInDate,
            @RequestParam("checkOutDate") Date checkOutDate,
            Model model) {

        Room room = roomService.findById(roomID);

        if (room == null) {
            model.addAttribute("error", "Room not found");
            return "";
        }

        Student student = new Student(fullName, gender, dateOfBirth, address, phoneNumber, room, school, mssv);
        studentService.save(student);

        Booking booking = new Booking();
        booking.setStudent(student);
        booking.setRoom(room);
        booking.setCheckInDate(checkInDate);
        booking.setCheckOutDate(checkOutDate);
        bookingService.save(booking);

        User user = new User();
        user.setUsername(mssv);
        user.setEmail(email);
        user.setPassword("defaultpassword");
        user.setRole("ROLE_STUDENT");
        user.setStudentID(student.getStudentID().intValue());
        userService.save(user);

        model.addAttribute("success", "Registration successful");
        return "register";
    }

    @GetMapping("/booking/rooms")
    public String getRooms() {
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
