package com.minc.jpa;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.minco.jpa.domain.UserInfo;
import com.minco.jpa.service.IUserService;

/**
 * Unit test for simple App.
 */
public class AppTest {
	private ClassPathXmlApplicationContext ctx;
	private IUserService userService;

	@Before
	public void initTest() {
		ctx = new ClassPathXmlApplicationContext("application.xml");
		userService = ctx.getBean("userService", IUserService.class);
	}

	@Test
	public void createUserTest() {
		UserInfo userInfo = new UserInfo();
		userInfo.setId(UUID.randomUUID().toString());
		userInfo.setPassword("1234564343");
		userInfo.setUserName("admin232");
		userService.createNewUser(userInfo);
	}

	@Test
	public void findUserTest() {
		String userId = "da040609-f1ed-4840-a74a-826d66cc0d95";
		UserInfo userInfo = userService.findUser(userId);
		Assert.assertEquals(userId, userInfo.getId());
	}
}
