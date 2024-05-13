package com.example.QuanLyKTX.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Room {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomID;
    
    @ManyToOne
    @JoinColumn(name = "BuildingID")
    private Building building;
    
    private String roomNumber;
    
    private int capacity;
    
    private int floor;
    
    private String status;

    public Room() {
        // Default constructor
    }

    public Room(Building building, String roomNumber, int capacity, int floor, String status) {
        this.building = building;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.floor = floor;
        this.status = status;
    }

    // Getters and setters
    public Long getRoomID() {
        return roomID;
    }

    public void setRoomID(Long roomID) {
        this.roomID = roomID;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
