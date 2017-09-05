package org.labsystem.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.labsystem.domain.service.iface.ResearchService;
import org.labsystem.entity.Researchfield;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.alibaba.fastjson.JSON;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "struts.xml" })
public class TestService {
	private static final Logger LOGGER = Logger.getLogger(TestService.class);

	@Autowired
	private ResearchService researchService;

	void testResearchService() {
		LOGGER.error(
				"luxiongbo_testResearchService1" + JSON.toJSONString(researchService.getAllResearchFieldView(false)));

		Researchfield researchfield = researchService.getResearchfield(1);
		LOGGER.error("luxiongbo_testResearchService2" + JSON.toJSONString(researchfield));

		LOGGER.error("luxiongbo_testResearchService3"
				+ JSON.toJSONString(researchService.getResearchDetailsViewByResearchField(researchfield, true)));
	}

	@Test
	public void testMain() {
		testResearchService();
	}

}
