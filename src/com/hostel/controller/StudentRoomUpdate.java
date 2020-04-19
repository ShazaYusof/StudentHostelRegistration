package com.hostel.controller;

import java.io.IOException;

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
 * Servlet implementation class StudentRoomUpdate
 */
@WebServlet("/StudentRoomUpdate")
public class StudentRoomUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRoomUpdate() {
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
		// TODO Auto-generated method stub
		//String studMatric = request.getParameter("studMatric");
		
		int studID = Integer.parseInt(request.getParameter("studID"));
		int roomID = Integer.parseInt(request.getParameter("roomID"));
		
		try
		{
			EJBFactory ejbm = new EJBFactory();
			StudentBeanManagerLocal sbm = ejbm.getStudentBeanManagerLocal();
			
			StudentBean studentBean = sbm.getResult(studID);
			
			//studentBean.setStudMatric(studMatric);
			studentBean.setRoomID(roomID);
			
			sbm.updateStudent(studentBean);
			request.setAttribute("studentinfo", studentBean);
			request.getRequestDispatcher("DisplayResult.jsp").forward(request, response);
		}
		
		catch(NamingException e)
		{
			e.printStackTrace();
		}
	}

}
