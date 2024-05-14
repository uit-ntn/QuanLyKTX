package com.example.quanlykytucxa.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.quanlykytucxa.entity.Booking;


@Service
public interface BookingService {

	List<Booking> findAll();

}