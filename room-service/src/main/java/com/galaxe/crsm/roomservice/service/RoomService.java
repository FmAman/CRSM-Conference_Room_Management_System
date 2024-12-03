package com.galaxe.crsm.roomservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.galaxe.crsm.roomservice.dto.RoomResponseDto;

@Service
public interface RoomService {
	public RoomResponseDto addConferenceRoom(RoomResponseDto roomResponseDto);
	public RoomResponseDto updateConferenceRoom(RoomResponseDto roomResponseDto);
	public String deleteConferenceRoom(int roomId);
	public List<RoomResponseDto> getAllConferenceRoom();
	public List<RoomResponseDto> getAllRoomByRoomLocation(String room_location);
	public RoomResponseDto getRoomByRoomId(int room_id);

	
}
