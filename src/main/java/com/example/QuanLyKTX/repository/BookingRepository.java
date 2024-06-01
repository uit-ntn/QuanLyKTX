package com.example.QuanLyKTX.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.QuanLyKTX.model.Booking;
import com.example.QuanLyKTX.model.MonthlyBookingCount;

import java.util.*;
@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    @Query("SELECT new com.example.QuanLyKTX.model.MonthlyBookingCount(TO_CHAR(b.checkInDate, 'YYYY-MM'), COUNT(b)) " +
    "FROM Booking b GROUP BY TO_CHAR(b.checkInDate, 'YYYY-MM') ORDER BY TO_CHAR(b.checkInDate, 'YYYY-MM')")
    List<MonthlyBookingCount> findMonthlyBookingCounts();   

}