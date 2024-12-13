package com.galaxe.crsm.adminservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomResponseDto {
	private int roomId;
	private String roomName;
	private int roomCapacity;
	private String roomLocation;
}
