package com.minco.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minco.jpa.domain.UserInfo;
import com.minco.jpa.persistence.IUserDAO;
import com.minco.jpa.service.IUserService;

@Service("userService")
public class UserService implements IUserService {
	
	@Autowired
	private IUserDAO  userDAO;
	
	public void createNewUser(UserInfo userInfo) {
		userDAO.saveUser(userInfo);
	}

	public UserInfo findUser(String id) {
		return userDAO.getUser(id);
	}

}
