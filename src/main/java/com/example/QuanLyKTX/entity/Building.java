package com.example.QuanLyKTX.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Building")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BuildingID")
    private Long buildingID;

    @Column(name = "BuildingName")
    private String buildingName;

    @Column(name = "BuildingType")
    private String buildingType;

    @Column(name = "TotalFloors")
    private int totalFloors;

    public Building() {
    }

    public Building(String buildingName, String buildingType, int totalFloors) {
        this.buildingName = buildingName;
        this.buildingType = buildingType;
        this.totalFloors = totalFloors;
    }

    // Getters and setters
    public Long getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(Long buildingID) {
        this.buildingID = buildingID;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    @Override
    public String toString() {
        return "Building{" +
                "buildingID=" + buildingID +
                ", buildingName='" + buildingName + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", totalFloors=" + totalFloors +
                '}';
    }
}

