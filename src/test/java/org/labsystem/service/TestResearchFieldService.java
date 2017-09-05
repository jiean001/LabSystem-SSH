package org.labsystem.service;

import org.apache.log4j.Logger;
import org.labsystem.domain.service.iface.ResearchfieldService;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;

public class TestResearchFieldService {
	private static final Logger LOGGER = Logger.getLogger(TestResearchFieldService.class);

	@Autowired
	private ResearchfieldService researchfieldService;

	private void testGetAllResearchField() {
		LOGGER.info("testGetAllResearchField: " + JSON.toJSONString(researchfieldService.getAllResearchfields(true)));
	}

	public void testMain() {
		testGetAllResearchField();
	}

}
