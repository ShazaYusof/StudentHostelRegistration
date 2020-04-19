package com.hostel.controller;

import java.io.IOException;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hostel.model.CollegeBean;
import com.hostel.model.StudentBean;
import com.hostel.model.manager.CollegeBeanManagerLocal;
import com.hostel.model.manager.EJBFactory;
import com.hostel.model.manager.StudentBeanManagerLocal;

/**
 * Servlet implementation class StudentCollegeUpdate
 */
@WebServlet("/StudentCollegeUpdate")
public class StudentCollegeUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentCollegeUpdate() {
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
		
		int studID = Integer.parseInt(request.getParameter("studID"));
		
		//String studMatric = request.getParameter("studMatric");
		String collName = request.getParameter("collName");
		int roomLvl = Integer.parseInt(request.getParameter("roomLvl"));
		
		
		
		try
		{
			EJBFactory ejbm = new EJBFactory();
			StudentBeanManagerLocal sbm = ejbm.getStudentBeanManagerLocal();
			CollegeBeanManagerLocal cbm = ejbm.getCollegeBeanManagerLocal();
			
			StudentBean studentBean = sbm.getResult(studID);
			CollegeBean collegeBean = cbm.getCollege(collName);
			
			System.out.println(studentBean.toString());
			System.out.println(collegeBean.toString());
			
			
			int collID = collegeBean.getCollID();
			
			//studentBean = sbm.getCollID(collID);
			
			//studentBean.setStudMatric(studMatric);
			studentBean.setCollID(collID);
			
			sbm.updateStudent(studentBean);
			request.setAttribute("studentinfo", studentBean);
			response.sendRedirect("StudentViewRoom?collName=" + collName + "&roomLvl=" + roomLvl);
			
		}
		
		
		catch(NamingException e)
		{
			e.printStackTrace();
		}
	}

}
