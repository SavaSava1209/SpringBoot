package com.usc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity // jpa OR mapping
@Table(name = "usc_user_profile")
public class UserProfile implements GrantedAuthority{
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	// we dont want it to be pulled so no many to many on role side
	@Column
	private String type;	
	
	public UserProfile() {
		super();
	}
	
	public UserProfile(int id) {
		super();
		this.id = id;
	}	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	

	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", type=" + type + "]";
	}

	@Override
	public String getAuthority() {
		return type;		
	}
	

}



