package com.minco.jpa;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.minco.jpa.service.UserService;

/**
 * Unit test for simple App.
 */
public class AppTest {
	private ClassPathXmlApplicationContext ctx;
	private UserService userService;

	@Before
	public void initTest() {
		ctx = new ClassPathXmlApplicationContext("application.xml");
		userService = ctx.getBean("userService", UserService.class);
	}
	@Test
	public void createUserTest() {
		int count = 1;
		userService.createNewAccount("admin", "1234", 200);
		int acCount=userService.getUserCount();
		Assert.assertEquals(count, acCount);
	}
}
