package com.example.quanlykytucxa.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quanlykytucxa.entity.Booking;

@Repository("bookingRepository")
public interface BookingRepository extends JpaRepository<Booking, Long> {
    
}
