package com.hostel.controller;

import java.io.IOException;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hostel.model.manager.EJBFactory;
import com.hostel.model.manager.StaffBeanManagerLocal;

/**
 * Servlet implementation class StaffDelete
 */
@WebServlet("/StaffDelete")
public class StaffDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String staffID = request.getParameter("staffID");
		
		try
		{
			EJBFactory ejbm = new EJBFactory();
			StaffBeanManagerLocal sbm = ejbm.getStaffBeanManagerLocal();
			
			sbm.deleteStaff(staffID);
			
			response.sendRedirect("StaffView");
		}
	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
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
