package org.labsystem.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.labsystem.domain.service.iface.SourceService;
import org.labsystem.entity.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.alibaba.fastjson.JSON;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "struts.xml" })
public class TestSourceImpl {
	private static final Logger LOGGER = Logger.getLogger(TestPaperService.class);

	@Autowired
	private SourceService sourceService;

	void testGetSource() {
		Source source = sourceService.getSource(1);
		System.out.println(source.toString());
		LOGGER.info("testGetSource" + JSON.toJSONString(source));
	}

	void testGetAllSource() {
		LOGGER.info("testGetAllSource" + JSON.toJSONString(sourceService.getAllSource()));
	}

	@Test
	public void testMain() {
		System.out.println("111111111111111111111");
		testGetSource();
		System.out.println("2222222222222222222222");
		testGetAllSource();
	}
}
