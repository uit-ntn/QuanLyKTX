package com.example.QuanLyKTX.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.QuanLyKTX.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    // // hàm trả về danh sách các phòng dựa trên giới tính, loại phòng và toafF
    // @Query("SELECT r FROM Room r JOIN Students s ON r.id = s.room.id WHERE s.gender = ?1 AND r.capacity = ?2 AND r.building.id = ?3")
    // List<Room> findByGenderAndCapacityAndBuildingId(String gender, Integer capacity, Long buildingId);

}
