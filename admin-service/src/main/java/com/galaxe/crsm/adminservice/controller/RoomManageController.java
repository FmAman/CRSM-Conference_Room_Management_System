package com.galaxe.crsm.adminservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galaxe.crsm.adminservice.dto.RoomResponseDto;
import com.galaxe.crsm.adminservice.util.FeignServiceUtil;

@RestController
@RequestMapping("/api/admin")
public class RoomManageController {
	
	@Autowired
	private FeignServiceUtil feignServiceUtil;
	 
	@PostMapping("add-conference-room")
	public RoomResponseDto addConferenceRooms(@RequestBody RoomResponseDto roomResponseDto) {
		return feignServiceUtil.addConferenceRooms(roomResponseDto);
	}

	@PutMapping("update-conference-room")
	public RoomResponseDto updateRoom(@RequestBody RoomResponseDto roomResponseDto) {
		return feignServiceUtil.updateRoom(roomResponseDto);
	}

	@DeleteMapping("delete-conference-room/{id}")
	public String deleteRoom(@PathVariable int id) {
		return feignServiceUtil.deleteRoom(id);
	}
	

}
