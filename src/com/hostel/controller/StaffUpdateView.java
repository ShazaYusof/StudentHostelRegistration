package com.hostel.controller;

import java.io.IOException;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hostel.model.StaffBean;
import com.hostel.model.manager.EJBFactory;
import com.hostel.model.manager.StaffBeanManagerLocal;

/**
 * Servlet implementation class StaffUpdateView
 */
@WebServlet("/StaffUpdateView")
public class StaffUpdateView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffUpdateView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StaffBean staff = (StaffBean)request.getSession().getAttribute("staffinfo");
		
		try {
			
			EJBFactory ejbm = new EJBFactory();
			StaffBeanManagerLocal sbm = ejbm.getStaffBeanManagerLocal();
			
			StaffBean sb = sbm.getStaff(staff.getStaffID());
			
			request.setAttribute("staffinfo", sb);
			request.getRequestDispatcher("StaffUpdatePage.jsp").forward(request, response);
			
			}
		catch (NamingException e) 
		{
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
