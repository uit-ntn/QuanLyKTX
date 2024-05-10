package com.example.QuanLyKTX.service;

import java.util.Date;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.QuanLyKTX.model.Student;
import com.example.QuanLyKTX.model.Booking;
import com.example.QuanLyKTX.model.Room;
import com.example.QuanLyKTX.repository.BookingRepository;
import com.example.QuanLyKTX.repository.RoomRepository;
import com.example.QuanLyKTX.repository.StudentRepository;

@Service
public class BookingService {
    @Autowired
    private RoomRepository roomRepository;
    
    @Autowired
    private StudentRepository studentRepository;
    
    @Autowired
    private BookingRepository bookingRepository;

    public List<Room> getAvailableRooms() {
        return roomRepository.findByStatus("Available");
    }

    public Booking bookRoom(Long studentId, Long roomId, Date checkInDate, Date checkOutDate) {
        Room room = roomRepository.findById(roomId).orElse(null);
        Student student = studentRepository.findById(studentId).orElse(null);
        if (room != null && student != null && room.getStatus().equals("Available")) {
            room.setStatus("Occupied");
            roomRepository.save(room);
            Booking booking = new Booking();
            booking.setStudent(student);
            booking.setRoom(room);
            booking.setCheckInDate(checkInDate);
            booking.setCheckInDate(checkOutDate);
            return bookingRepository.save(booking);
        }
        return null;
    }
}
