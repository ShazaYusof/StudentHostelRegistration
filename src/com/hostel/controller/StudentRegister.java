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
 * Servlet implementation class StudentRegister
 */
@WebServlet("/StudentRegister")
public class StudentRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegister() {
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
		// TODO Auto-generated method stub
		
		String studMatric = request.getParameter("studMatric");
		String studIC = request.getParameter("studIC");
		String studName = request.getParameter("studName");
		String studAdd = request.getParameter("studAdd");
		String studCourse = request.getParameter("studCourse");
		String studEmail = request.getParameter("studEmail");
		String studPassword = request.getParameter("studPassword");
		String studPhoneNo = request.getParameter("studPhoneNo");
		String studStatus = null;
		int studSemester = Integer.parseInt(request.getParameter("studSemester"));
		int collID = 0;
		int roomID = 0;
		
		
		
		StudentBean stb = new StudentBean(studMatric, studIC, studName, studAdd, studPhoneNo,
				studCourse, studSemester, studEmail, studStatus, collID, roomID, studPassword);
		
		System.out.println(stb.toString());
		
		
		try {
			//get EJB and call function to register this staff
			EJBFactory ejbm = new EJBFactory();
			StudentBeanManagerLocal ubm = ejbm.getStudentBeanManagerLocal();
			stb = ubm.register(stb);
			
			/*check value in our stateless bean, debugging purpose only
			List<StudentBean> students = ubm.getStudents();
			System.out.println("no of registeres Student: " + students.size());
			System.out.println("student list: ");
			System.out.println(students.toString());*/
		}
		
		catch(NamingException e)
		{
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("studentbean",stb);
		request.getRequestDispatcher("StudentSuccess.jsp").forward(request, response);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
