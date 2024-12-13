package com.galaxe.crsm.roomservice.service.serviceImpl;

import java.util.List;

import com.galaxe.crsm.roomservice.dto.RoomResponseDto;

public interface RoomService {

	RoomResponseDto addConferenceRoom(RoomResponseDto roomResponseDto);

	RoomResponseDto updateConferenceRoom(RoomResponseDto roomResponseDto);

	String deleteConferenceRoom(int roomId);

	List<RoomResponseDto> getAllConferenceRoom();

	RoomResponseDto getRoomByRoomId(int room_id);

	List<RoomResponseDto> getAllRoomByRoomLocation(String room_location);

}
