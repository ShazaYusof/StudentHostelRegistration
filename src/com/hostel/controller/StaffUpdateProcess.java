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
 * Servlet implementation class StaffUpdateProcess
 */
@WebServlet("/StaffUpdateProcess")
public class StaffUpdateProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffUpdateProcess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// get data from page
		Integer staffID = Integer.parseInt(request.getParameter("staffID"));// hidden input
		//copy from register staff servlet then modify as follow
		String staffEmail = request.getParameter("staffEmail");
		String staffUsername = request.getParameter("staffUsername");
		String staffPassword = request.getParameter("staffPassword");
		String staffAdd = request.getParameter("staffAdd");
		int staffPNo = Integer.parseInt(request.getParameter("staffPNo"));
		
		try 
		{
			EJBFactory ejbm = new EJBFactory();
			StaffBeanManagerLocal sbm = ejbm.getStaffBeanManagerLocal();
			
			//initialize staff bean object
			StaffBean staffBean = sbm.getStaff(staffID);
			
			
			staffBean.setStaffID(staffID);
			staffBean.setStaffEmail(staffEmail);
			staffBean.setStaffUsername(staffUsername);
			staffBean.setStaffPassword(staffPassword);
			staffBean.setStaffAdd(staffAdd);
			staffBean.setStaffPNo(staffPNo);
			
			//StaffBean staff = (StaffBean)request.getSession().getAttribute("staffinfo");
			
			
			sbm.updateStaff(staffBean);
			request.setAttribute("staffinfo", staffBean);
			request.getRequestDispatcher("StaffDetails.jsp").forward(request, response);
		}
		
		catch (NamingException e) 
		{
			e.printStackTrace();
		}
  }
}


