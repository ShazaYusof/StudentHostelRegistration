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
 * Servlet implementation class StaffRegister
 */
@WebServlet("/StaffRegister")
public class StaffRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffRegister() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String staffName = request.getParameter("staffName");
		String staffEmail = request.getParameter("staffEmail");
		String staffUsername = request.getParameter("staffUsername");
		String staffPassword = request.getParameter("staffPassword");
		String staffAdd = request.getParameter("staffAdd");
		int staffPNo = Integer.parseInt(request.getParameter("staffPNo"));
		
		// put into a bean(generate normal constructor in staffBean if not exist)
		StaffBean sb = new StaffBean();
		//System.out.println(sb.toString());
		
		// put into a bean(generate normal constructor in staffBean if not exist)
		//StaffBean sb = new StaffBean(staffID,admin,staffName,staffEmail,staffUsername,staffPassword,staffAdd,staffPNo) ;

		//System.out.println(sb.toString());
		
		//later we will send this bean to our Enterprise JavaBean to be inserted into DB
		//send the staffBean to register method in staffBeanManager
		
		try {
			//get EJB and call function to register this staff
			EJBFactory ejbm = new EJBFactory();
			StaffBeanManagerLocal sbm = ejbm.getStaffBeanManagerLocal();
			
			sb.setStaffName(staffName);
			sb.setStaffAdd(staffAdd);
			sb.setStaffEmail(staffEmail);
			sb.setStaffPNo(staffPNo);
			sb.setStaffUsername(staffUsername);
			sb.setStaffPassword(staffPassword);
			
			AdminBean ab = (AdminBean)request.getSession().getAttribute("admininfo");
			
			sb.setAdID(ab.getAdID());
			
			sbm.register(sb);
			
			System.out.println(ab.toString());
			
			/*
			//check value in our stateless bean, debugging purpose only
			List<StaffBean> staffs = sbm.getStaffs();
			System.out.println("no of registeres Staffs: " + staffs.size());
			System.out.println("staff list: ");
			System.out.println(staffs.toString());*/
		}
		catch(NamingException e)
		{
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("staffbean",sb);
		request.getRequestDispatcher("StaffRegisterSuccess.jsp").forward(request, response);
	}

		
		//catch(java.text.ParseException e)
		//{
		//	System.out.println("Error Parsing Due Date Vaue");
		//	e.printStackTrace();
		//}
		
		//request.setAttribute("staffbean",staffBean);
		//request.getRequestDispatcher("StaffRegister.jsp").forward(request, response);
}


