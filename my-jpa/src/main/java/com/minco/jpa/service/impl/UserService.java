package com.minco.jpa.service.impl;

import com.minco.jpa.domain.UserInfo;
import com.minco.jpa.persistence.IUserDAO;
import com.minco.jpa.persistence.UserDAO;
import com.minco.jpa.service.IUserService;

public class UserService implements IUserService {
	
	private IUserDAO  userDAO;
	
	public void createNewUser(UserInfo userInfo) {
		userDAO = new UserDAO();
		userDAO.saveUser(userInfo);
	}

	public UserInfo findUser(String id) {
		userDAO = new UserDAO();
		return userDAO.getUser(id);
	}

}
