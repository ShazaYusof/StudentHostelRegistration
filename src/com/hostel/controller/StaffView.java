package com.hostel.controller;

import java.io.IOException;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hostel.model.AdminBean;
import com.hostel.model.StaffBean;
import com.hostel.model.manager.EJBFactory;
import com.hostel.model.manager.StaffBeanManagerLocal;

/**
 * Servlet implementation class StaffView
 */
@WebServlet("/StaffView")
public class StaffView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		AdminBean admin = (AdminBean)request.getSession().getAttribute("admininfo");
		
		try
		{
			EJBFactory ejbm = new EJBFactory();
			StaffBeanManagerLocal sbm = ejbm.getStaffBeanManagerLocal();
			
			List<StaffBean> staffs = sbm.getAllStaff(admin.getAdID());
			request.setAttribute("staffs",staffs);
			request.getRequestDispatcher("adminViewStaff.jsp").forward(request, response);;
		}
		catch(NamingException e)
		{
			e.printStackTrace();
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
