package com.hostel.controller;

import java.io.IOException;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hostel.model.StudentBean;
import com.hostel.model.manager.EJBFactory;
import com.hostel.model.manager.StudentBeanManagerLocal;

/**
 * Servlet implementation class StaffUpdateStudent
 */
@WebServlet("/StaffUpdateViewStudent")
public class StaffUpdateViewStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffUpdateViewStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		//get list of student for this user using EJB
		try
		{
			EJBFactory ejbm = new EJBFactory();
			StudentBeanManagerLocal stm = ejbm.getStudentBeanManagerLocal();
			
			List<StudentBean>students = stm.getStudents();
			
			request.setAttribute("students", students);
			request.getRequestDispatcher("StaffViewStudent.jsp").forward(request, response);
			
		}
		
		catch(NamingException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
