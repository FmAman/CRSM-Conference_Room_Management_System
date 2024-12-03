package com.galaxe.crsm.roomservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galaxe.crsm.roomservice.dto.RoomResponseDto;
import com.galaxe.crsm.roomservice.service.RoomService;

@RestController
@RequestMapping("api/rooms")
public class RoomController {

	@Autowired
	RoomService roomService;

	@PostMapping("add-conference-room")
	public RoomResponseDto addConferenceRooms(@RequestBody RoomResponseDto roomResponseDto) {
		return roomService.addConferenceRoom(roomResponseDto);
	}

	@PutMapping("update-conference-room")
	public RoomResponseDto updateRoom(@RequestBody RoomResponseDto roomResponseDto) {
		return roomService.updateConferenceRoom(roomResponseDto);
	}

	@DeleteMapping("delete-conference-room/{id}")
	public String deleteRoom(@PathVariable int id) {
		return roomService.deleteConferenceRoom(id);
	}

	@GetMapping("get-all-rooms")
	public ResponseEntity<List<RoomResponseDto>> getAllRooms() {
		return new ResponseEntity<>( roomService.getAllConferenceRoom(), HttpStatus.OK);
	}

	@GetMapping("get-all-rooms-by-location/{location}")
	public List<RoomResponseDto> getAllRoomByLocation(@PathVariable String location) {
		return roomService.getAllRoomByRoomLocation(location);
	}

	@GetMapping("get-all-rooms-by-id/{id}")
	public RoomResponseDto getAllRoomById(@PathVariable int id) {
		return roomService.getRoomByRoomId(id);
	}
}
