package org.labsystem.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.alibaba.fastjson.JSON;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "struts.xml" })
public class TestUserService {
	private static final Logger LOGGER = Logger.getLogger(TestUserService.class);

	@Autowired
	private AdminService userService;

	/*
	 * public boolean checkUser(String username, String password){ Admin user =
	 * adminDao.selectByUsername(username); return user!=null &&
	 * user.getPassword().equals(SafeUtil.encode(password)); }
	 */

	@Test
	public void checkUser() {
		LOGGER.info("TESTcheckUser 1 1");
		boolean b1 = userService.checkUser("1", "1");
		boolean b2 = userService.checkUser("1", "2");
		LOGGER.info(JSON.toJSONString(b1 + " " + b2));
		System.out.println(b1 + " " + b2);
	}
}
