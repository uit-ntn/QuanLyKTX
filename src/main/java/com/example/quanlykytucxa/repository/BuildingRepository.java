package com.example.quanlykytucxa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quanlykytucxa.entity.Building;
@Repository
public interface BuildingRepository extends JpaRepository<Building, Long> {
}
