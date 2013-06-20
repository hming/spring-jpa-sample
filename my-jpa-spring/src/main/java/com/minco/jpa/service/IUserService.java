package com.minco.jpa.service;

import com.minco.jpa.domain.UserInfo;

public interface IUserService {
	/**
	 * create new user
	 * @param userInfo
	 */
	public void createNewUser(UserInfo userInfo);
	
	/**
	 * find the user by id
	 * @param id
	 * @return
	 */
	public UserInfo findUser(String id);
}
