package com.hostel.model.manager;
import java.util.List;
import javax.ejb.Local;
import com.hostel.model.AdminBean;

@Local
public interface AdminBeanManagerLocal {
	List<AdminBean> getAdmins();
	AdminBean login(String adUsername, String adPassword);

}









