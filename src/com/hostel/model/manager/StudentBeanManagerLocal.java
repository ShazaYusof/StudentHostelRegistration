package com.hostel.model.manager;

import java.util.List;

import javax.ejb.Local;


import com.hostel.model.StudentBean;

@Local
public interface StudentBeanManagerLocal 
{
	StudentBean register(StudentBean std);
	List<StudentBean>  getStudents();
	StudentBean login(String studMatric, String studPassword);
	boolean updateStudent(StudentBean studentBean);
	StudentBean getStudents(String studMatric);
	StudentBean getResult(int studID);
	StudentBean getCollID(int collID);
}
