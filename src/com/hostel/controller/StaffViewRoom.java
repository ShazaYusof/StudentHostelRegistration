package com.hostel.controller;

import java.io.IOException;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hostel.model.RoomBean;
import com.hostel.model.manager.EJBFactory;
import com.hostel.model.manager.RoomBeanManagerLocal;

/**
 * Servlet implementation class StaffViewRoom
 */
@WebServlet("/StaffViewRoom")
public class StaffViewRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffViewRoom() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		try
		{
			EJBFactory ejbm = new EJBFactory();
			RoomBeanManagerLocal rbm = ejbm.getRoomBeanManagerLocal();
			
			List<RoomBean>rooms = rbm.getRooms();
			request.setAttribute("rooms", rooms);
			request.getRequestDispatcher("StaffViewRoom.jsp").forward(request, response);
		}
		catch(NamingException e) 
		{
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
