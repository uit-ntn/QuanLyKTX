package com.example.QuanLyKTX.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyKTX.model.Room;
import com.example.QuanLyKTX.repository.RoomRepository;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return (List<Room>) roomRepository.findAll();
        // Câu lệnh findAll() trả về một đối tượng của kiểu Iterable<Room> ko phải
        // (List<Room>)
        // ép kiểu từ Iterable<Room> sang List<Room>.
    }

    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }

    public Room findById(Long roomId) {
        return roomRepository.findById(roomId).orElse(null);
    }

    public Room updateRoom(Long roomId, Room updatedRoom) {
        return roomRepository.findById(roomId).map(room -> {
            room.setRoomNumber(updatedRoom.getRoomNumber());
            room.setCapacity(updatedRoom.getCapacity());
            room.setFloor(updatedRoom.getFloor());
            room.setBuilding(updatedRoom.getBuilding());
            room.setStatus(updatedRoom.getStatus());
            return roomRepository.save(room);
        }).orElse(null);
    }

    public boolean deleteRoom(Long roomId) {
        if (roomRepository.existsById(roomId)) {
            roomRepository.deleteById(roomId);
            return true;
        }
        return false;
    }

    public Map<String, Long> getRoomStatusCount() {
        List<Room> rooms = roomRepository.findAll();
        Map<String, Long> statusCount = new HashMap<>();
        statusCount.put("Available", rooms.stream().filter(room -> "Available".equals(room.getStatus())).count());
        statusCount.put("Booked", rooms.stream().filter(room -> "Booked".equals(room.getStatus())).count());
        statusCount.put("Reserved", rooms.stream().filter(room -> "Reserved".equals(room.getStatus())).count());
        return statusCount;
    }

    public List<Room> findRoomsByCriteria(String buildingType, int capacity, Long buildingId) {
        return roomRepository.findByBuildingTypeAndCapacityAndBuildingId(buildingType, capacity, buildingId);
    }

}
