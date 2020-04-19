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
 * Servlet implementation class StaffUpdateRoomProcess
 */
@WebServlet("/StaffUpdateRoomProcess")
public class StaffUpdateRoomProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffUpdateRoomProcess() {
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
		int roomNum = Integer.parseInt(request.getParameter("roomNum"));
		int roomID = Integer.parseInt(request.getParameter("roomID"));
		String roomStatus = request.getParameter("roomStatus");
		int collID = Integer.parseInt(request.getParameter("collID"));
		int roomLvl = Integer.parseInt(request.getParameter("roomLvl"));
		
		
			try
			{
				EJBFactory ejbm = new EJBFactory();
				RoomBeanManagerLocal rbm = ejbm.getRoomBeanManagerLocal();
				 
				RoomBean roomBean = rbm.getRooms(roomNum);
				
				roomBean.setRoomNum(roomNum);
				roomBean.setRoomID(roomID);
				roomBean.setRoomStatus(roomStatus);
				roomBean.setCollID(collID);
				roomBean.setRoomLvl(roomLvl);
				
				rbm.updateRoom(roomBean);
				//request.setAttribute("roominfo", roomBean);
				//request.getRequestDispatcher("StaffViewRoom.jsp").forward(request, response);
				
				response.sendRedirect("StaffViewRoom");
				
			}
			catch(NamingException e)
			{
				e.printStackTrace();
			}
		
	}

}
