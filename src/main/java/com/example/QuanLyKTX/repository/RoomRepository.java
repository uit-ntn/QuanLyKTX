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

    @Query("SELECT r FROM Room r JOIN r.building b WHERE b.buildingType = :buildingType AND r.capacity = :capacity AND b.buildingID = :buildingId")
    List<Room> findByBuildingTypeAndCapacityAndBuildingId(@Param("buildingType") String buildingType,
            @Param("capacity") int capacity, @Param("buildingId") Long buildingId);
}
