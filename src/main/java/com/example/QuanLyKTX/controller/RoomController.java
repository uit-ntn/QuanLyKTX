package com.example.QuanLyKTX.controller;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.QuanLyKTX.model.Room;
import com.example.QuanLyKTX.service.RoomService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RoomController {
    private RoomService roomService = new RoomService(); 

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/booking/rooms")
    public String RoomList() {
        return "roomList";
    }
    

   
}
