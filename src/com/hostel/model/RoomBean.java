package com.hostel.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="room")
public class RoomBean implements Serializable
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int roomNum;
	private int roomID;
	private String roomStatus;
	private int collID;
	private int roomLvl;
	
	public RoomBean() {}

	public RoomBean(int roomNum, int roomID, String roomStatus, int collID, int roomLvl) {
		super();
		this.roomNum = roomNum;
		this.roomID = roomID;
		this.roomStatus = roomStatus;
		this.collID = collID;
		this.roomLvl = roomLvl;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}

	public String getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}

	public int getCollID() {
		return collID;
	}

	public void setCollID(int collID) {
		this.collID = collID;
	}

	public int getRoomLvl() {
		return roomLvl;
	}

	public void setRoomLvl(int roomLvl) {
		this.roomLvl = roomLvl;
	}
	
	
	
}