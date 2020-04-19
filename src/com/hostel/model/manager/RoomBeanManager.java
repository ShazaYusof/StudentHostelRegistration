package com.hostel.model.manager;

import java.io.IOException;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hostel.model.RoomBean;

@SuppressWarnings("unused")
@Stateless
@Local
public class RoomBeanManager implements RoomBeanManagerLocal
{
	List<RoomBean> Rooms;
	
	EntityManagerFactory emfactory;
	
	public RoomBeanManager()
	{
		emfactory = Persistence.createEntityManagerFactory("mysqlJPA");
	}
	
	public List<RoomBean> getRooms()
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		System.out.println("getting rooms list");
		@SuppressWarnings("unchecked")
		List<RoomBean> Rooms = em.createQuery("select r from RoomBean r").getResultList();
		em.getTransaction().commit();
		em.close();
		return Rooms;
	}
	
	public boolean updateAvailability(RoomBean roomBean)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(roomBean);
		em.getTransaction().commit();
		em.close();
		
		return true;
	}


	public List<RoomBean> getRooms(int collID, int roomLvl) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		List<RoomBean> roomList;
		try 
		{
			TypedQuery<RoomBean> query=em.createQuery("select r from RoomBean r where r.collID=:collID AND r.roomLvl=:roomLvl", RoomBean.class);
			query.setParameter("collID", collID);
			query.setParameter("roomLvl", roomLvl);
			roomList = query.getResultList();
		}
		
		catch(Exception e) {roomList = null;}
		
		em.getTransaction().commit();
		em.close();
		return roomList;
	}
	
	public RoomBean getRooms(int roomNum) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		RoomBean rb;
		try
		{
			TypedQuery<RoomBean> query = em.createQuery("select r from RoomBean r where r.roomNum=:roomNum", RoomBean.class);
			query.setParameter("roomNum", roomNum);
			rb = query.getSingleResult();
		}
		catch (Exception e)
		{
			rb=null;
		}
		
		em.getTransaction().commit();
		em.close();
		return rb;
	}
	
	
	public boolean updateRoom(RoomBean roomBean)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(roomBean);
		em.getTransaction().commit();
		em.close();
		
		return true;
	}

	
	public RoomBean getResult(String roomStatus) 
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		RoomBean roomBean = em.find(RoomBean.class, roomStatus);
		em.getTransaction().commit();
		em.close();
		return roomBean;
	}

}
