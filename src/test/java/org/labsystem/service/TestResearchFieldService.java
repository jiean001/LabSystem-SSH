package org.labsystem.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.labsystem.domain.service.iface.ResearchfieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.alibaba.fastjson.JSON;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "struts.xml" })
public class TestResearchFieldService {
	private static final Logger LOGGER = Logger.getLogger(TestResearchFieldService.class);

	@Autowired
	private ResearchfieldService researchfieldService;

	private void testGetAllResearchField() {
		LOGGER.info("testGetAllResearchField: " + JSON.toJSONString(researchfieldService.getAllResearchfields(true)));
	}

	@Test
	public void testMain() {
		testGetAllResearchField();
	}

}
