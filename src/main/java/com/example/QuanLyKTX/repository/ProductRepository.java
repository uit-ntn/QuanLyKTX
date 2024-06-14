package com.example.QuanLyKTX.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.QuanLyKTX.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
