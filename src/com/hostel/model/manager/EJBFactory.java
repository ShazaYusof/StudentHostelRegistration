package com.hostel.model.manager;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EJBFactory 
{
	Context context;
	
	/**
	 * initialize the lookup properties. if the EJB is in remote server, configure
	 * it here by defining the remote server location
	 * @throws NamingException
	 */
	
	public EJBFactory() throws NamingException
	{
		final Hashtable<String, String> jndiProperties = new Hashtable<>();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,
				"org.wildfly.naming.client.WildFlyInitialContextFactory");
		context = new InitialContext(jndiProperties);
	}
	
	/**
	 * Lookup UserBean Entity Manager
	 * @return UserbeanManager object
	 * @throws NamingException
	 */
	
	public StaffBeanManagerLocal getStaffBeanManagerLocal() throws NamingException
	{
		return(StaffBeanManagerLocal) context.lookup("java:global/hostel/StaffBeanManager!"
				+ StaffBeanManagerLocal.class.getName());
	}
	
	
	public AdminBeanManagerLocal getAdminBeanManagerLocal() throws NamingException
	{
		return(AdminBeanManagerLocal) context.lookup("java:global/hostel/AdminBeanManager!"
				+ AdminBeanManagerLocal.class.getName());
	}
	
	
	public StudentBeanManagerLocal getStudentBeanManagerLocal() throws NamingException
	{
		return(StudentBeanManagerLocal) context.lookup("java:global/hostel/StudentBeanManager!"
				+ StudentBeanManagerLocal.class.getName());
	}
	

	public CollegeBeanManagerLocal getCollegeBeanManagerLocal() throws NamingException
	{
		return(CollegeBeanManagerLocal) context.lookup("java:global/hostel/CollegeBeanManager!"
				+ CollegeBeanManagerLocal.class.getName());
	}
	
	
	public RoomBeanManagerLocal getRoomBeanManagerLocal() throws NamingException
	{
		return(RoomBeanManagerLocal) context.lookup("java:global/hostel/RoomBeanManager!"
				+ RoomBeanManagerLocal.class.getName());
	}
	
}
