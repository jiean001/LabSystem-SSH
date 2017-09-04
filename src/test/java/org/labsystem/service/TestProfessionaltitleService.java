package org.labsystem.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.labsystem.domain.service.iface.ProfessionaltitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.alibaba.fastjson.JSON;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "struts.xml" })
public class TestProfessionaltitleService {
	private static final Logger LOGGER = Logger.getLogger(TestProfessionaltitleService.class);

	@Autowired
	private ProfessionaltitleService professionaltitleService;

	void testGetProfessionaltitle() {
		LOGGER.info("getProfessionaltitle" + JSON.toJSONString(professionaltitleService.getProfessionaltitle(1)));
	}

	void testGetAllProfessionaltitles() {
		LOGGER.info(
				"getAllProfessionaltitles" + JSON.toJSONString(professionaltitleService.getAllProfessionaltitles()));
	}

	@Test
	public void testMain() {
		testGetProfessionaltitle();
		testGetAllProfessionaltitles();
	}

}
