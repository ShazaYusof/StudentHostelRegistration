

package com.hostel.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class CollegeBean implements Serializable
{
	
	@Id
	@GeneratedValue
	private int collID;
	private String collName;
	private String collCategory;

	
	public CollegeBean() 
	{
		
	}


	public CollegeBean(int collID, String collName, String collCategory) 
	{
		this.collID = collID;
		this.collName = collName;
		this.collCategory = collCategory;
	}


	public int getCollID() {
		return collID;
	}


	public void setCollID(int collID) {
		this.collID = collID;
	}


	public String getCollName() {
		return collName;
	}


	public void setCollName(String collName) {
		this.collName = collName;
	}


	public String getCollCategory() {
		return collCategory;
	}


	public void setCollCategory(String collCategory) {
		this.collCategory = collCategory;
	}


	public String toString() {
		return "CollegeBean [collID=" + collID + ", collName=" + collName + ", collCategory=" + collCategory + "]";
	}
	
	
	
	

}