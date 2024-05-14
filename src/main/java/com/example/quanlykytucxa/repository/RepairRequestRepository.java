package com.example.quanlykytucxa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quanlykytucxa.entity.RepairRequest;
@Repository
public interface RepairRequestRepository extends JpaRepository<RepairRequest, Long> {
}
