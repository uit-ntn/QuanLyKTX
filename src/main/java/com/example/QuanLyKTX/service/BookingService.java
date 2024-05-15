package com.example.QuanLyKTX.service;

import com.example.QuanLyKTX.model.Booking;
import com.example.QuanLyKTX.repository.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}
