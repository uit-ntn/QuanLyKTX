package com.example.QuanLyKTX.repository;

import com.example.QuanLyKTX.model.Cart;
import com.example.QuanLyKTX.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByStudentID(Long studentID);

    @Query(value = "SELECT cart_seq.NEXTVAL FROM dual", nativeQuery = true)
    Long getNextCartId();
}
