package com.example.QuanLyKTX.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

import com.example.QuanLyKTX.model.Building;
import com.example.QuanLyKTX.service.BuildingService;


@Controller
public class BuildingController {
    private BuildingService buildingService = null;

    public BuildingController(BuildingService buildingService) {
        this.buildingService = buildingService;
    }

    @GetMapping(value = "/api/buildings", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Building> getAllBuildings() {
        return buildingService.getAllBuildings();
    }

}
