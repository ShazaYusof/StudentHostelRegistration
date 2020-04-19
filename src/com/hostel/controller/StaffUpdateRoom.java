package com.hostel.controller;

import java.io.IOException;

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
 * Servlet implementation class StaffUpdateRoom
 */
@WebServlet("/StaffUpdateRoom")
public class StaffUpdateRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffUpdateRoom() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		int roomNum = Integer.parseInt(request.getParameter("roomNum"));
		
		try
		{
			EJBFactory ejbm = new EJBFactory();
			RoomBeanManagerLocal rbm = ejbm.getRoomBeanManagerLocal();
			RoomBean rb = rbm.getRooms(roomNum);
			
			request.setAttribute("roombean", rb);
			request.getRequestDispatcher("StaffUpdateRoom.jsp").forward(request, response);
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
