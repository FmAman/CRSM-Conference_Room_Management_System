package com.galaxe.crsm.roomservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galaxe.crsm.roomservice.model.Room;

public interface RoomRepository extends JpaRepository<Room, Integer> {

}
