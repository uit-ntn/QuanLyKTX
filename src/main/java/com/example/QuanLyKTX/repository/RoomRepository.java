// RoomRepository.java
package com.example.QuanLyKTX.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.QuanLyKTX.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findByBuildingBuildingIDAndCapacityAndBuildingBuildingType(Long buildingID, int capacity,
            String buildingType);

}
