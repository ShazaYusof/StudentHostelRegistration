package com.hostel.model.manager;


import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.hostel.model.StudentBean;

/**
 * Implementation of all the methods listed in the interface
 * @author DELL
 */
@Stateless
@Local
public class StudentBeanManager implements StudentBeanManagerLocal
{
	List<StudentBean> Students;
	
	EntityManagerFactory emfactory;
	
	public StudentBeanManager()
	{
		emfactory = Persistence.createEntityManagerFactory("mysqlJPA");
	}
	
	public StudentBean register(StudentBean std) 
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(std);
		System.out.println("registered: " + std.toString());
		
		em.getTransaction().commit();
		
		em.close();
		return std;
	}
	
	public List<StudentBean> getStudents()
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		System.out.println("getting students list");

		@SuppressWarnings("unchecked")
		List<StudentBean> Students = em.createQuery("select u from StudentBean u").getResultList();
		em.getTransaction().commit();
		em.close();
		return Students;
	}
	
	
	public StudentBean login(String studMatric, String studPassword)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		StudentBean student;
		try 
		{
			TypedQuery<StudentBean> query = em.createQuery("select u from StudentBean u where u.studMatric =:studMatric and u.studPassword =:studPassword",StudentBean.class);
			query.setParameter("studMatric", studMatric);
			query.setParameter("studPassword", studPassword);
			student = query.getSingleResult();
		}
		catch(Exception e)
		{
			student = null; //invalid login
		}
		
		em.getTransaction().commit();
		em.close();
		return student;
	}

	public boolean updateStudent(StudentBean studentBean)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(studentBean);
		em.getTransaction().commit();
		em.close();
		return true;
	}

	
	public StudentBean getStudents(String studMatric) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		StudentBean sb;
		try
		{
			TypedQuery<StudentBean> query = em.createQuery("select s from StudentBean s where s.studMatric=:studMatric", StudentBean.class);
			query.setParameter("studMatric", studMatric);
			sb = query.getSingleResult();
		}
		
		catch(Exception e)
		{
			sb=null;
		}
		
		em.getTransaction().commit();
		em.close();
		return sb;
	}

	public StudentBean getResult(int studID) {
		// TODO Auto-generated method stub
		
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		StudentBean sb;
		try
		{
			TypedQuery<StudentBean> query = em.createQuery("select s from StudentBean s where s.studID=:studID",StudentBean.class);
			query.setParameter("studID", studID);
			sb=query.getSingleResult();
		}
		
		catch(Exception e)
		{
			sb=null;
		}
		em.getTransaction().commit();
		em.close();
		return sb;
	}
	
	public StudentBean getCollID(int collID)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		StudentBean sb;
		try
		{
			TypedQuery<StudentBean> query=em.createQuery("select s from StudentBean s where s.collID=:collID ",StudentBean.class);
			query.setParameter("collID", collID);
			sb = query.getSingleResult();
		}
		catch(Exception e)
		{
			sb=null;
		}
		
		em.getTransaction().commit();
		em.close();
		return sb;
	}
	
	
}

