package com.hostel.controller;

import java.io.IOException;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hostel.model.StaffBean;
import com.hostel.model.manager.EJBFactory;
import com.hostel.model.manager.StaffBeanManagerLocal;

/**
 * Servlet implementation class StaffLogin
 */
@WebServlet("/StaffLogin")
public class StaffLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffLogin() {
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
		String staffUsername = request.getParameter("staffUsername");
		String staffPassword = request.getParameter("staffPassword");
		
		try
		{
			EJBFactory ejbm=new EJBFactory();
			StaffBeanManagerLocal sbm = ejbm.getStaffBeanManagerLocal();
			StaffBean sb = sbm.login(staffUsername, staffPassword);
			
			if(sb !=null)
			{
				//valid
				HttpSession session = request.getSession();
				session.setAttribute("staffinfo", sb);
				response.sendRedirect("StaffHomePage.jsp");
			}
			
			else
			{
				request.setAttribute("loginerror","yes");
				request.getRequestDispatcher("StaffLogin.jsp").forward(request,response);
			}
		}
		
		catch(NamingException e) 
		{
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}


