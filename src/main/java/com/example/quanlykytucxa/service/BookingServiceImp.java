package com.example.quanlykytucxa.service;

import com.example.quanlykytucxa.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.quanlykytucxa.repository.BookingRepository;

@Service
public class BookingServiceImp implements BookingService {

	@Autowired
	BookingRepository bookingRepository;

	@Override
	public List<Booking> findAll() {
		return bookingRepository.findAll();
	}

}