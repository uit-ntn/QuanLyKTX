package com.example.quanlykytucxa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quanlykytucxa.entity.AdminStaff;
@Repository
public interface AdminStaffRepository extends JpaRepository<AdminStaff, Long> {
}
