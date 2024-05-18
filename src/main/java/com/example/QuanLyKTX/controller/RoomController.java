package com.example.QuanLyKTX.controller;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
}
