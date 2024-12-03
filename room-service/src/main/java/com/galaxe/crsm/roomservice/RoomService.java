package com.galaxe.crsm.roomservice;

import java.util.List;

import com.galaxe.crsm.roomservice.dto.RoomRequestDto;
import com.galaxe.crsm.roomservice.dto.RoomResponseDto;

public interface RoomService {
	public RoomResponseDto addConferenceRoom(RoomRequestDto roomResponseDto);
	public RoomResponseDto updateConferenceRoom(RoomRequestDto roomResponseDto);
	public String deleteConferenceRoom(RoomRequestDto roomRequestDto);
	public List<RoomResponseDto> getAllConferenceRoom();
	public List<RoomResponseDto> getAllRoomByRoomLocation(String room_location);
	public List<RoomResponseDto> getRoomByRoomName(String room_name);

	
}
