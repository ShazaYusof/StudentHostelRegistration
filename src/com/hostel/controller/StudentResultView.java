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
 * Servlet implementation class StudentResultView
 */
@WebServlet("/StudentResultView")
public class StudentResultView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentResultView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		StudentBean student = (StudentBean)request.getSession().getAttribute("studentinfo");
		
		try
		{
			EJBFactory ejbm = new EJBFactory();
			StudentBeanManagerLocal stb = ejbm.getStudentBeanManagerLocal();
			
			 student = stb.getResult(student.getStudID());
			
			
			if(student.getStudStatus().equals("SUCCESSFUL"))
			{
				HttpSession session = request.getSession();
				session.setAttribute("studentinfo",student);
				response.sendRedirect("StudentHostelResultSuccess.jsp");
			}
			
			else if(student.getStudStatus().equals("NOT SUCCESSFUL"))
			{
				HttpSession session = request.getSession();
				session.setAttribute("studentinfo",student);
				response.sendRedirect("StudentHostelResultFailed.jsp");
			}
			else
			{
				HttpSession session = request.getSession();
				session.setAttribute("studentinfo",student);
				request.getRequestDispatcher("StudentHostelResult.jsp").forward(request, response);
				//response.sendRedirect("StudentHostelResult.jsp");
			}
			
		}
		
		catch(NamingException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
