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
 * Servlet implementation class StaffUpdateStudentStatusProcess
 */
@WebServlet("/StaffUpdateStudentStatusProcess")
public class StaffUpdateStudentStatusProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffUpdateStudentStatusProcess() {
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
		String studMatric = request.getParameter("studMatric");
		String studName = request.getParameter("studName");
		String studIC = request.getParameter("studIC");
		String studPhoneNo = request.getParameter("studPhoneNo");
		String studCourse = request.getParameter("studCourse");
		int studSemester = Integer.parseInt(request.getParameter("studSemester"));
		String studEmail = request.getParameter("studEmail");
		String studStatus = request.getParameter("studStatus");
		
		
		try
		{
			EJBFactory ejbm = new EJBFactory();
			StudentBeanManagerLocal sbm = ejbm.getStudentBeanManagerLocal();
			
			StudentBean studentBean = sbm.getStudents(studMatric);
			
			studentBean.setStudMatric(studMatric);
			studentBean.setStudName(studName);
			studentBean.setStudIC(studIC);
			studentBean.setStudPhoneNo(studPhoneNo);
			studentBean.setStudCourse(studCourse);
			studentBean.setStudSemester(studSemester);
			studentBean.setStudEmail(studEmail);
			studentBean.setStudStatus(studStatus);
		
		
			
			sbm.updateStudent(studentBean);
			//request.setAttribute("studentinfo", studentBean);
			//request.getRequestDispatcher("StaffViewStudent.jsp").forward(request, response);	
			response.sendRedirect("StaffUpdateViewStudent");
		}
		
		catch(NamingException e)
		{
			e.printStackTrace();
		}
	}

}
