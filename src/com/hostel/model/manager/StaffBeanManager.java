package com.hostel.model.manager;


import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.Query;


import com.hostel.model.StaffBean;

/**
 * Implementation of all the methods listed in the interface
 * @author DELL
 */
@Stateless
@Local
public class StaffBeanManager implements StaffBeanManagerLocal
{
	List<StaffBean> Staffs;
	
	EntityManagerFactory emfactory;
	
	public StaffBeanManager()
	{
		emfactory = Persistence.createEntityManagerFactory("mysqlJPA");
	}
	
	
	public StaffBean register(StaffBean staff) 
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(staff);
		System.out.println("registered: " + staff.toString());
		
		em.getTransaction().commit();
		
		em.close();
		return staff;
	}
	
	
	public List<StaffBean> getStaffs()
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		System.out.println("getting staffs list");
		@SuppressWarnings("unchecked")
		List<StaffBean> Staffs = em.createQuery("select u from StaffBean u").getResultList();
		em.getTransaction().commit();
		em.close();
		return Staffs;
	}
	
	
	public List<StaffBean> getAllStaff(int adID)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		@SuppressWarnings("unchecked")
		List<StaffBean> staffs = em.createQuery("select s from StaffBean s where s.adID=:adID").setParameter("adID", adID).getResultList();
		
		
		em.close();
	
		return staffs;
	}
	
	
	public StaffBean login(String staffUsername, String staffPassword)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		StaffBean staff;
		try 
		{
			TypedQuery<StaffBean> query = em.createQuery("select u from StaffBean u where u.staffUsername =:staffUsername and u.staffPassword =:staffPassword",StaffBean.class);
			query.setParameter("staffUsername", staffUsername);
			query.setParameter("staffPassword", staffPassword);
			staff = query.getSingleResult();
		}
		catch(Exception e)
		{
			staff = null; //invalid login
		}
		
		em.getTransaction().commit();
		em.close();
		return staff;
	}
	
	
	@Override
	public StaffBean addStaff(StaffBean staffBean)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(staffBean);
		System.out.println("added staff : " + staffBean.toString());
		
		em.getTransaction().commit();
		em.close();
		
		return staffBean;
	}
	
	@Override
	public StaffBean getStaff(int staffID) 
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();

		StaffBean staffBean = em.find(StaffBean.class, staffID);
		em.close();
		return staffBean;
	}
	
	@Override
	public boolean updateStaff(StaffBean staffBean)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		//update the data into database
		em.merge(staffBean);
		em.getTransaction().commit();
		em.close();
		return true;
	}
	
	@Override
	public boolean deleteStaff(String staffID)
	{
		int staffIdInt = Integer.parseInt(staffID);
		
		EntityManager em = emfactory.createEntityManager();
		
		//em.getTransaction().begin();
		//StaffBean staffBean = em.find(StaffBean.class, staffIdInt);
		
		em.getTransaction().begin();
		Query query = em.createQuery("delete from StaffBean s where s.staffID = :staffID").setParameter("staffID", staffIdInt);
		
		boolean status = true;
		
		if(query.executeUpdate()== 0)
		{
			status = false;	
		}
		
		em.getTransaction().commit();
		em.close();
		
		return status;
	}

	
	
}

