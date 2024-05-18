package com.example.QuanLyKTX.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RoomID")
    private Long roomID;

    @Column(name = "BuildingID")
    private Long buildingID;

    @Column(name = "RoomNumber")
    private String roomNumber;

    @Column(name = "Capacity")
    private int capacity;

    @Column(name = "Floor")
    private int floor;

    @Column(name = "Status")
    private String status;

    public Room() {
    }

    public Room(Long buildingID, String roomNumber, int capacity, int floor, String status) {
        this.buildingID = buildingID;
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

    public Long getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(Long buildingID) {
        this.buildingID = buildingID;
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

    @Override
    public String toString() {
        return "Room{" +
                "roomID=" + roomID +
                ", buildingID=" + buildingID +
                ", roomNumber='" + roomNumber + '\'' +
                ", capacity=" + capacity +
                ", floor=" + floor +
                ", status='" + status + '\'' +
                '}';
    }
}

