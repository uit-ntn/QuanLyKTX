package com.example.QuanLyKTX.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyKTX.model.Room;
import com.example.QuanLyKTX.repository.RoomRepository;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return (List<Room>) roomRepository.findAll(); 
        // Câu lệnh findAll() trả về một đối tượng của kiểu Iterable<Room> ko phải (List<Room>)
        // ép kiểu từ Iterable<Room> sang List<Room>.
    }

}
