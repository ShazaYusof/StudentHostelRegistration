package com.hostel.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentBean implements Serializable 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studID;
	
	private String studMatric;
	private String studIC;
	private String studName;
	private String studAdd;
	private String studPhoneNo;
	private String studCourse;
	private int studSemester;
	private String studEmail;
	private String studStatus;
	private int collID;
	private int roomID;
	private String studPassword;
	
	public StudentBean() {}
	
	public StudentBean(int studID, String studMatric, String studIC, String studName, String studAdd, String studPhoneNo,
			String studCourse, int studSemester, String studEmail, String studStatus, int collID, int roomID, String studPassword) {
		
		this.studID=studID;
		this.studMatric = studMatric;
		this.studIC = studIC;
		this.studName = studName;
		this.studAdd = studAdd;
		this.studPhoneNo = studPhoneNo;
		this.studCourse = studCourse;
		this.studSemester = studSemester;
		this.studEmail = studEmail;
		this.studStatus = studStatus;
		this.collID = collID;
		this.roomID = roomID;
		this.studPassword = studPassword;
	}
	
	public StudentBean(String studMatric, String studIC, String studName, String studAdd, String studPhoneNo,
			String studCourse, int studSemester, String studEmail, String studStatus, int collID, int roomID, String studPassword) {
		
		this.studMatric = studMatric;
		this.studIC = studIC;
		this.studName = studName;
		this.studAdd = studAdd;
		this.studPhoneNo = studPhoneNo;
		this.studCourse = studCourse;
		this.studSemester = studSemester;
		this.studEmail = studEmail;
		this.studStatus = studStatus;
		this.collID = collID;
		this.roomID = roomID;
		this.studPassword = studPassword;
	}

	public int getStudID() {
		return studID;
	}

	public void setStudID(int studID) {
		this.studID = studID;
	}

	public String getStudMatric() {
		return studMatric;
	}

	public void setStudMatric(String studMatric) {
		this.studMatric = studMatric;
	}

	public String getStudIC() {
		return studIC;
	}

	public void setStudIC(String studIC) {
		this.studIC = studIC;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudAdd() {
		return studAdd;
	}

	public void setStudAdd(String studAdd) {
		this.studAdd = studAdd;
	}

	public String getStudPhoneNo() {
		return studPhoneNo;
	}

	public void setStudPhoneNo(String studPhoneNo) {
		this.studPhoneNo = studPhoneNo;
	}

	public String getStudCourse() {
		return studCourse;
	}

	public void setStudCourse(String studCourse) {
		this.studCourse = studCourse;
	}

	public int getStudSemester() {
		return studSemester;
	}

	public void setStudSemester(int studSemester) {
		this.studSemester = studSemester;
	}

	public String getStudEmail() {
		return studEmail;
	}

	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}

	public String getStudStatus() {
		return studStatus;
	}

	public void setStudStatus(String studStatus) {
		this.studStatus = studStatus;
	}

	public int getCollID() {
		return collID;
	}

	public void setCollID(int collID) {
		this.collID = collID;
	}

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}

	public String getStudPassword() {
		return studPassword;
	}

	public void setStudPassword(String studPassword) {
		this.studPassword = studPassword;
	}

	@Override
	public String toString() {
		return "StudentBean [studID=" + studID + ", studMatric=" + studMatric + ", studIC=" + studIC + ", studName="
				+ studName + ", studAdd=" + studAdd + ", studPhoneNo=" + studPhoneNo + ", studCourse=" + studCourse
				+ ", studSemester=" + studSemester + ", studEmail=" + studEmail + ", studStatus=" + studStatus
				+ ", collID=" + collID + ", roomID=" + roomID + ", studPassword=" + studPassword + "]";
	}

		}	