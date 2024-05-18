package com.example.QuanLyKTX.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyKTX.model.Building;
import com.example.QuanLyKTX.repository.BuildingRepository;

@Service
public class BuildingService {
    
    @Autowired
    private BuildingRepository buidlingRepository;

    public List<Building> getAllBuildings() {
        return buidlingRepository.findAll();
    }
}
