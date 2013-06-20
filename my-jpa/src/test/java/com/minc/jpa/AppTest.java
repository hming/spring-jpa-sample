package com.minc.jpa;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

import com.minco.jpa.domain.UserInfo;
import com.minco.jpa.service.IUserService;
import com.minco.jpa.service.impl.UserService;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private IUserService userService;
	
	@Before
	public void initTest(){
		userService = new UserService();
	}
	
	@Test
	public void createUserTest(){
		UserInfo userInfo  = new UserInfo();
		userInfo.setId(UUID.randomUUID().toString());
		userInfo.setPassword("123456");
		userInfo.setUserName("admin");
		userService.createNewUser(userInfo);
	}
}
