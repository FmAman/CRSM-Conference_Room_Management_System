package com.galaxe.crsm.adminservice.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.galaxe.crsm.adminservice.dto.RoomResponseDto;

@FeignClient(value = "feignRoomAdmin", url = "http://localhost:8082/api/rooms")
public interface FeignServiceUtil {
	
	@PostMapping("add-conference-room")
	public RoomResponseDto addConferenceRooms(@RequestBody RoomResponseDto roomResponseDto);

	@PutMapping("update-conference-room")
	public RoomResponseDto updateRoom(@RequestBody RoomResponseDto roomResponseDto);

	@DeleteMapping("delete-conference-room/{id}")
	public String deleteRoom(@PathVariable int id);

}
