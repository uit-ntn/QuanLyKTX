package com.example.QuanLyKTX.controller;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.QuanLyKTX.model.Room;
import com.example.QuanLyKTX.service.RoomService;

@Controller
public class RoomController {
    private RoomService roomService = null;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping(value = "/api/rooms", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Room> getAllRoooms() {
        return roomService.getAllRooms();
    }
    
    @PostMapping("api/rooms")
    public ResponseEntity<Room> addRoom(@RequestBody Room room) {
        System.out.println(room);
        Room savedRoom = roomService.saveRoom(room);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedRoom);
    }

    @GetMapping("api/rooms/{roomId}")
    public ResponseEntity<Room> getRoomById(@PathVariable Long roomId) {
        Room room = roomService.findById(roomId);
        return ResponseEntity.ok(room);
    }

    @PutMapping("/api/rooms/{roomId}")
    public ResponseEntity<Room> updateStudent(@PathVariable Long roomId, @RequestBody Room updatedRoom) {
        Room room = roomService.updateRoom(roomId, updatedRoom);
        if (room == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(room);
    }

    @DeleteMapping("/api/rooms/{roomId}")
    public ResponseEntity<Void> deleteRoom(@PathVariable Long roomId) {
        boolean isDeleted = roomService.deleteRoom(roomId);
        if (!isDeleted) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/rooms/status-count")
    public ResponseEntity<Map<String, Long>> getRoomStatusCount() {
        Map<String, Long> statusCount = roomService.getRoomStatusCount();
        return ResponseEntity.ok(statusCount);
    }
}
