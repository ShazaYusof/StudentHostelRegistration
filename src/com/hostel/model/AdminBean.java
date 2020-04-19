package com.hostel.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="admin")

public class AdminBean implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int adID;
	private String adName;
	private String adAdd;
	private int adPNo;
	private String adEmail;
	private String adPassword;
	private String adUsername;
	
	public AdminBean()
	{
		
	}
	
	public AdminBean(int adID, String adName, String adAdd, int adPNo,String adEmail, String adPassword, String adUsername)
	{
		this.adID = adID;
		this.adName = adName;
		this.adAdd = adAdd;
		this.adPNo = adPNo;
		this.adEmail = adEmail;
		this.adPassword = adPassword;
		this.adUsername = adUsername;
		
	}

	public int getAdID() {
		return adID;
	}

	public void setAdID(int adID) {
		this.adID = adID;
	}

	public String getAdName() {
		return adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public String getAdAdd() {
		return adAdd;
	}

	public void setAdAdd(String adAdd) {
		this.adAdd = adAdd;
	}

	public int getAdPNo() {
		return adPNo;
	}

	public void setAdPNo(int adPNo) {
		this.adPNo = adPNo;
	}

	public String getAdEmail() {
		return adEmail;
	}

	public void setAdEmail(String adEmail) {
		this.adEmail = adEmail;
	}

	public String getAdPassword() {
		return adPassword;
	}

	public void setAdPassword(String adPassword) {
		this.adPassword = adPassword;
	}

	public String getAdUsername() {
		return adUsername;
	}

	public void setAdUsername(String adUsername) {
		this.adUsername = adUsername;
	}

	@Override
	public String toString() {
		return "AdminBean [adID=" + adID + ", adName=" + adName + ", adAdd=" + adAdd + ", adPNo=" + adPNo + ", adEmail="
				+ adEmail + ", adPassword=" + adPassword + ", adUsername=" + adUsername + "]";
	}
	
	
}
