package com.hostel.model.manager;

//import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.hostel.model.AdminBean;

@Stateless
@Local
public class AdminBeanManager implements AdminBeanManagerLocal{
	List<AdminBean> admins;
	
	EntityManagerFactory emfactory;
	public AdminBeanManager() {
		emfactory = Persistence.createEntityManagerFactory("mysqlJPA");
	}
	
	
	public AdminBean login(String adUsername, String adPassword) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		AdminBean admin;
		try {
			TypedQuery<AdminBean> query=
					em.createQuery("select a from AdminBean a where a.adUsername=:adUsername and a.adPassword=:adPassword",AdminBean.class);
			query.setParameter("adUsername",adUsername);
			query.setParameter("adPassword",adPassword);
			admin=query.getSingleResult();
		}
		
		catch(Exception e) {
			admin = null;// invalid login
		}
		em.getTransaction().commit();
		em.close();
		return admin;//return user object if valid, null if not
	}


	@Override
	public List<AdminBean> getAdmins() {
		// TODO Auto-generated method stub
		return null;
	}
		
		
	}


