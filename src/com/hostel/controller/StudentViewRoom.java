package com.hostel.controller;

import java.io.IOException;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hostel.model.CollegeBean;
import com.hostel.model.RoomBean;
import com.hostel.model.manager.CollegeBeanManagerLocal;
import com.hostel.model.manager.EJBFactory;
import com.hostel.model.manager.RoomBeanManagerLocal;

/**
 * Servlet implementation class StudentViewRoom
 */
@WebServlet("/StudentViewRoom")
public class StudentViewRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentViewRoom() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String collName = request.getParameter("collName");
		int roomLvl = Integer.parseInt(request.getParameter("roomLvl"));
		
		System.out.println(collName+roomLvl);
		
		try {
				EJBFactory ejbm = new EJBFactory();
				CollegeBeanManagerLocal cbm = ejbm.getCollegeBeanManagerLocal();
				RoomBeanManagerLocal rbm = ejbm.getRoomBeanManagerLocal();
				CollegeBean cb = cbm.getCollege(collName);
			
				int collID = cb.getCollID();
				List<RoomBean> roomList = rbm.getRooms(collID,roomLvl);
				System.out.println(roomList.size());
			
				request.setAttribute("room", roomList);
				request.getRequestDispatcher("RoomRegisterForm.jsp").forward(request, response);
			
			
			} 
		
			catch(NamingException e)
		{
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String collName = request.getParameter("collName");
		int roomLvl = Integer.parseInt(request.getParameter("roomLvl"));
		
		System.out.println(collName+roomLvl);
		
		try {
				EJBFactory ejbm = new EJBFactory();
				CollegeBeanManagerLocal cbm = ejbm.getCollegeBeanManagerLocal();
				RoomBeanManagerLocal rbm = ejbm.getRoomBeanManagerLocal();
				CollegeBean cb = cbm.getCollege(collName);
			
				int collID = cb.getCollID();
				List<RoomBean> roomList = rbm.getRooms(collID,roomLvl);
				System.out.println(roomList.size());
			
				request.setAttribute("room", roomList);
				request.getRequestDispatcher("RoomRegisterForm.jsp").forward(request, response);
			
			
			} 
		
			catch(NamingException e)
		{
			
		}
	}

}
