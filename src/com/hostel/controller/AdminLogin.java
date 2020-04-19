package com.hostel.controller;

import java.io.IOException;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hostel.model.AdminBean;
import com.hostel.model.manager.AdminBeanManagerLocal;
import com.hostel.model.manager.EJBFactory;


/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get fields from form
		String adUsername = request.getParameter("adUsername");
		String adPassword = request.getParameter("adPassword");
		
		//check the user name and password inside the database
		try {
			EJBFactory ejbm=new EJBFactory();
			AdminBeanManagerLocal abm = ejbm.getAdminBeanManagerLocal();
			AdminBean ab = abm.login(adUsername, adPassword);
			
			if(ab !=null) {
				//valid
				HttpSession session = request.getSession();
				session.setAttribute("admininfo",ab);
				//request.getRequestDispatcher("AdminLoginSuccess.jsp").forward(request,response);
				response.sendRedirect("AdminHomePage.jsp");
			}
			
			else {
				//not valid
				request.setAttribute("loginerror","yes");
				request.getRequestDispatcher("AdminLogin.jsp").forward(request,response);
			    }
			}
		catch(NamingException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	