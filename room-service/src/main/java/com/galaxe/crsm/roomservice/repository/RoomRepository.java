package com.galaxe.crsm.roomservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galaxe.crsm.roomservice.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
	
	List<Room> findByRoomLocation(String room_location);
	Room findByRoomId(int room_id);
	void deleteByRoomId(int roomId);
}
