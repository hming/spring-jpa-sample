package com.minco.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="USER_INFO")
public class UserInfo implements Serializable {
	
	@Transient
	private static final long serialVersionUID = -8172173205611182274L;

	@Transient
	private static final int ID_LENGTH = 52;
	
	private String id;
	private String userName;
	private String password;

	@Id
	@Column(length=ID_LENGTH)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(length=100)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(length=128)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
