package com.example.QuanLyKTX.service;

import com.example.QuanLyKTX.model.Booking;
import com.example.QuanLyKTX.model.MonthlyBookingCount;
import com.example.QuanLyKTX.repository.BookingRepository;
import java.util.stream.Collectors;
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

    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public Booking findById(Long bookingId) {
        return bookingRepository.findById(bookingId).orElse(null);
    }

    public Booking updateBooking(Long bookingId, Booking updatedBooking) {
        return bookingRepository.findById(bookingId).map(booking -> {
            booking.setCheckInDate(updatedBooking.getCheckInDate());
            booking.setCheckOutDate(updatedBooking.getCheckOutDate());
            booking.setRoom(updatedBooking.getRoom());
            booking.setStudent(updatedBooking.getStudent());
            return bookingRepository.save(booking);
        }).orElse(null);
    }
    
    public boolean deleteBooking(Long bookingId) {
        if (bookingRepository.existsById(bookingId)) {
            bookingRepository.deleteById(bookingId);
            return true;
        }
        return false;
    }

    public long countBookings() {
        return bookingRepository.count();
    }

    public List<MonthlyBookingCount> getMonthlyBookingCounts() {
        return bookingRepository.findMonthlyBookingCounts();
    }
}
