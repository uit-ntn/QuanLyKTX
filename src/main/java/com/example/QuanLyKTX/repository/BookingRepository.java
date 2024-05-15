package com.example.QuanLyKTX.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.QuanLyKTX.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    // JpaRepository đã cung cấp phương thức findAll(), không cần thêm gì ở đây
}