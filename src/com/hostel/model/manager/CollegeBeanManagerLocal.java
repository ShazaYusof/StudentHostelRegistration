package com.hostel.model.manager;

import java.util.List;

import javax.ejb.Local;

import com.hostel.model.CollegeBean;

@Local
public interface CollegeBeanManagerLocal 
{
	List<CollegeBean>  getColleges();
	boolean updateAvailability(CollegeBean collegeBean);
	CollegeBean getCollege(String collName);

}
