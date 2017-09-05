package org.labsystem.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.labsystem.domain.service.iface.ResearchService;
import org.labsystem.domain.service.iface.RespaperService;
import org.labsystem.entity.Research;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.alibaba.fastjson.JSON;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "struts.xml" })
public class TestResPaperService {
	private static final Logger LOGGER = Logger.getLogger(TestResPaperService.class);

	@Autowired
	private RespaperService respaperService;
	@Autowired
	private ResearchService researchService;

	private void testGetPaperSimpleByResearch() {
		Research research = researchService.getResearch(1);
		LOGGER.info("testGetPaperSimpleByResearch: " + JSON.toJSONString(respaperService.getPaperSimpleByResearch(research, true)));
	}

	@Test
	public void testMain() {
		testGetPaperSimpleByResearch();
	}

}
