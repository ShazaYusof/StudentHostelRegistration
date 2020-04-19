package com.hostel.controller;

import java.io.IOException;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hostel.model.StudentBean;
import com.hostel.model.manager.EJBFactory;
import com.hostel.model.manager.StudentBeanManagerLocal;

/**
 * Servlet implementation class StudentLogin
 */
@WebServlet("/StudentLogin")
public class StudentLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentLogin() {
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
		// get fields from form
		String studMatric = request.getParameter("studMatric");
		String studPassword = request.getParameter("studPassword");
		
		//check the user name and password inside the database
				try {
					EJBFactory ejbm=new EJBFactory();
					StudentBeanManagerLocal sbm = ejbm.getStudentBeanManagerLocal();
					StudentBean sb = sbm.login(studMatric, studPassword);
					
					if(sb !=null) {
						//valid
						HttpSession session = request.getSession();
						session.setAttribute("studentinfo",sb);
						request.getRequestDispatcher("StudentHomePage.jsp").forward(request,response);
					}
					
					else {
						//not valid
						request.setAttribute("loginerror","yes");
						request.getRequestDispatcher("StudentLogin.jsp").forward(request,response);
					    }
					}
				catch(NamingException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}