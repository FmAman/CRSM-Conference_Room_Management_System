package com.galaxe.crsm.roomservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomRequestDto {
	
	private String room_name;
	private String room_capacity;
	private String room_location;
}
