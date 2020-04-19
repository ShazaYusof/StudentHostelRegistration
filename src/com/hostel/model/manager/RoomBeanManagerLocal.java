package com.hostel.model.manager;

import java.util.List;

import javax.ejb.Local;

import com.hostel.model.RoomBean;

@Local
public interface RoomBeanManagerLocal 
{
	List<RoomBean> getRooms();
	List<RoomBean> getRooms(int collID, int roomLvl);
	boolean updateRoom(RoomBean roomBean);
	RoomBean getRooms(int roomNum);
	RoomBean getResult(String roomStatus);

}
