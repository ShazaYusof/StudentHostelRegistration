
package com.hostel.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="staff")

public class StaffBean implements Serializable
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staffID;
	
	private String staffName;
	
	private String staffAdd;

	private int staffPNo;

	private String staffEmail;
	
	private String staffPassword;
	
	private String staffUsername;
	
	private int adID;
	
	public StaffBean() {}
	
	

	public StaffBean(int staffID, String staffName, String staffAdd, int staffPNo, String staffEmail,
			String staffPassword, String staffUsername, int adID) {

		this.staffID = staffID;
		this.staffName = staffName;
		this.staffAdd = staffAdd;
		this.staffPNo = staffPNo;
		this.staffEmail = staffEmail;
		this.staffPassword = staffPassword;
		this.staffUsername = staffUsername;
		this.adID = adID;
	}
	
	public StaffBean(String staffName, String staffAdd, int staffPNo, String staffEmail,
			String staffPassword, String staffUsername, int adID) {

		this.staffName = staffName;
		this.staffAdd = staffAdd;
		this.staffPNo = staffPNo;
		this.staffEmail = staffEmail;
		this.staffPassword = staffPassword;
		this.staffUsername = staffUsername;
		this.adID = adID;
	}



	public int getStaffID() {
		return staffID;
	}



	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}



	public String getStaffName() {
		return staffName;
	}



	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}



	public String getStaffAdd() {
		return staffAdd;
	}



	public void setStaffAdd(String staffAdd) {
		this.staffAdd = staffAdd;
	}



	public int getStaffPNo() {
		return staffPNo;
	}



	public void setStaffPNo(int staffPNo) {
		this.staffPNo = staffPNo;
	}



	public String getStaffEmail() {
		return staffEmail;
	}



	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}



	public String getStaffPassword() {
		return staffPassword;
	}



	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}



	public String getStaffUsername() {
		return staffUsername;
	}



	public void setStaffUsername(String staffUsername) {
		this.staffUsername = staffUsername;
	}



	public int getAdID() {
		return adID;
	}



	public void setAdID(int adID) {
		this.adID = adID;
	}



	@Override
	public String toString() {
		return "StaffBean [staffID=" + staffID + ", staffName=" + staffName + ", staffAdd=" + staffAdd + ", staffPNo="
				+ staffPNo + ", staffEmail=" + staffEmail + ", staffPassword=" + staffPassword + ", staffUsername="
				+ staffUsername + ", adID=" + adID + "]";
	}
	
	
	
	
}