package com.galaxe.crsm.roomservice.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxe.crsm.roomservice.dto.RoomResponseDto;
import com.galaxe.crsm.roomservice.model.Room;
import com.galaxe.crsm.roomservice.repository.RoomRepository;
import com.galaxe.crsm.roomservice.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	RoomRepository roomRepository;

	@Override
	public RoomResponseDto addConferenceRoom(RoomResponseDto roomResponseDto) {
		Room conferenceRoom = mapToRoomEntity(roomResponseDto);
		Room savedRoom = roomRepository.save(conferenceRoom);
		return mapToRoomResponseDto(savedRoom);
	}

	@Override
	public RoomResponseDto updateConferenceRoom(RoomResponseDto roomResponseDto) {
		if (getRoomByRoomId(roomResponseDto.getRoomId()) != null) {
			RoomResponseDto conferenceRoom = getRoomByRoomId(roomResponseDto.getRoomId());
			Room updateRoom = roomRepository.save(mapToRoomEntity(conferenceRoom));
			return mapToRoomResponseDto(updateRoom);
		} else
			return addConferenceRoom(roomResponseDto);
	}

	@Override
	public String deleteConferenceRoom(int roomId) {
		if (getRoomByRoomId(roomId) != null) {
			roomRepository.deleteById(roomId);
			return "Conference Room Deleted Successfully";
		} else
			return "Conference Room Was Not Deleted!!";
	}

	@Override
	public List<RoomResponseDto> getAllConferenceRoom() {
		List<RoomResponseDto> roomResponseList = roomRepository.findAll().stream()
				.map(room -> mapToRoomResponseDto(room)).toList();
		return roomResponseList;
	}

	@Override
	public List<RoomResponseDto> getAllRoomByRoomLocation(String room_location) {
		return roomRepository.findByRoomLocation(room_location).stream().map(room -> mapToRoomResponseDto(room))
				.toList();
	}

	@Override
	public RoomResponseDto getRoomByRoomId(int room_id) {
		RoomResponseDto roomResponseDto = mapToRoomResponseDto(roomRepository.findByRoomId(room_id));
		return roomResponseDto;
	}

	private Room mapToRoomEntity(RoomResponseDto roomResponseDto) {
		Room room = new Room();
		room.setRoomCapacity(roomResponseDto.getRoomCapacity());
		room.setRoomLocation(roomResponseDto.getRoomLocation());
		room.setRoomName(roomResponseDto.getRoomName());
		return room;
	}

	private RoomResponseDto mapToRoomResponseDto(Room room) {
		RoomResponseDto roomResponseDto = new RoomResponseDto();
		roomResponseDto.setRoomId(room.getRoomId());
		roomResponseDto.setRoomName(room.getRoomName());
		roomResponseDto.setRoomLocation(room.getRoomLocation());
		roomResponseDto.setRoomCapacity(room.getRoomCapacity());
		return roomResponseDto;
	}

}
