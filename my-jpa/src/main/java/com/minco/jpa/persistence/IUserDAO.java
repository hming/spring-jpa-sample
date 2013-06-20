package com.minco.jpa.persistence;

import com.minco.jpa.domain.UserInfo;

public interface IUserDAO {
	/**
	 * save user
	 * 
	 * @param userInfo
	 */
	public void saveUser(UserInfo userInfo);
	
	/**
	 * get user by id
	 * @param id
	 * @return
	 */
	public UserInfo getUser(String id);
}
