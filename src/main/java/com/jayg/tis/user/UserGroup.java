package com.jayg.tis.user;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class UserGroup implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 67011081072343755L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userGroupId = 0;
	private String userGroupName;
	private String userGroupDescription;
	
	public int getUserGroupId() {
		return userGroupId;
	}
	public void setUserGroupId(int userGroupId) {
		this.userGroupId = userGroupId;
	}
	public String getUserGroupName() {
		return userGroupName;
	}
	public void setUserGroupName(String userGroupName) {
		this.userGroupName = userGroupName;
	}
	public String getUserGroupDescription() {
		return userGroupDescription;
	}
	public void setUserGroupDescription(String userGroupDescription) {
		this.userGroupDescription = userGroupDescription;
	}
	
	
}
