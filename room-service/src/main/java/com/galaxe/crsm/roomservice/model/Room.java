package com.galaxe.crsm.roomservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "room")
@Data
public class Room {

	@Id
    @Column(name = "room_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomId;

    @Column(name = "room_name")
    private String roomName;

    @Column(name = "room_location")
    private String roomLocation;

    @Column(name = "room_capacity")
    private int roomCapacity;

}
