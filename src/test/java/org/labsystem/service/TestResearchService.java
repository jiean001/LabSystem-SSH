package org.labsystem.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.labsystem.domain.service.iface.ResearchService;
import org.labsystem.entity.Research;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.alibaba.fastjson.JSON;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "struts.xml" })
public class TestResearchService {
	private static final Logger LOGGER = Logger.getLogger(TestResearchService.class);

	@Autowired
	private ResearchService researchService;
	Research tmpResearch;

	void testAddResearch() {
		Research research = new Research("机器视觉", "computer television", "这里是机器视觉", "this is the tv");
		LOGGER.info("testAddProject: " + JSON.toJSONString(researchService.addResearch(research)));
	}

	void testGetResearch() {
		tmpResearch = researchService.getResearch(3);
		LOGGER.info("testGetResearch" + JSON.toJSONString(tmpResearch));
	}

	void testModifyResearch() {
		tmpResearch.setResearchintroC("心若解放拉萨福克斯");
		LOGGER.info("testModifyProject: " + JSON.toJSONString(researchService.modifyResearch(tmpResearch)));
	}

	void testGetAllResearch() {
		LOGGER.info("testGetAllProjects: " + JSON.toJSONString(researchService.getAllResearch()));
	}

	void testDeleteResearch() {
		LOGGER.info("testDeleteResearch: " + JSON.toJSONString(researchService.deleteResearch(tmpResearch)));
	}

	@Test
	public void testMain() {
		testAddResearch();
		testGetResearch();
		testModifyResearch();
		testGetAllResearch();
		testDeleteResearch();
	}

}
