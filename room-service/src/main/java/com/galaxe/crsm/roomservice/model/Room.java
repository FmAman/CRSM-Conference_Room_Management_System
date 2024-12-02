package com.galaxe.crsm.roomservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "room")
@Data
public class Room {

	@Id
	private int room_id;

	@Column
	private String room_name;
	@Column
	private String room_location;
	@Column
	private String room_capacity;

}
