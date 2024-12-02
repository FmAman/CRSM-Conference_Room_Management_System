package com.galaxe.crsm.roomservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galaxe.crsm.roomservice.model.Room;
import com.galaxe.crsm.roomservice.repository.RoomRepository;

@RestController
@RequestMapping("rooms")
public class RoomController {
	
	@Autowired
	RoomRepository roomRepository;
	
	@Post
	
	@GetMapping
	public List<Room> getAllRooms() {
		return roomRepository.findAll();
	}

}
