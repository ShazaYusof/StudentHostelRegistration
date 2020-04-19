package com.hostel.model.manager;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.hostel.model.CollegeBean;

@Stateless
@Local
public class CollegeBeanManager implements CollegeBeanManagerLocal
{
	List<CollegeBean> Colleges;
	
	EntityManagerFactory emfactory;
	
	public CollegeBeanManager()
	{
		emfactory = Persistence.createEntityManagerFactory("mysqlJPA");
	}
	
	public List<CollegeBean> getColleges()
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		System.out.println("getting colleges list");
		@SuppressWarnings("unchecked")
		List<CollegeBean> Colleges = em.createQuery("select c from CollegeBean c").getResultList();
		em.getTransaction().commit();
		em.close();
		return Colleges;
	}
	
	public boolean updateAvailability(CollegeBean collegeBean)
	{
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(collegeBean);
		em.getTransaction().commit();
		em.close();
		
		return true;
	}

	public CollegeBean getCollege(String collName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		CollegeBean cb;
		
		try {
			
			TypedQuery<CollegeBean> query = em.createQuery("select c from CollegeBean c where c.collName=:collName", CollegeBean.class);
			query.setParameter("collName", collName);
			cb = query.getSingleResult();
			
		} catch (Exception e) {
			cb=null;
		}
		em.getTransaction().commit();
		em.close();
		return cb;
	}

}

