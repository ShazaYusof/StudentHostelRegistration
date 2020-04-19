package com.hostel.model.manager;

import java.util.List;

import javax.ejb.Local;

import com.hostel.model.AdminBean;
import com.hostel.model.StaffBean;


@Local
public interface StaffBeanManagerLocal 
{
	StaffBean register(StaffBean staff);
	List<StaffBean>  getStaffs();
	StaffBean login(String staffUsername, String staffPassword);
	List<StaffBean> getAllStaff(int adID);
	StaffBean addStaff(StaffBean staffBean);
	StaffBean getStaff (int staffID);
	boolean updateStaff(StaffBean staffBean);
	boolean deleteStaff(String staffID);
}
