package org.labsystem.service;

import org.apache.log4j.Logger;
import org.labsystem.domain.service.iface.SourceService;
import org.labsystem.entity.Source;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;

public class TestSourceImpl {
	private static final Logger LOGGER = Logger.getLogger(TestSourceImpl.class);

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

	// @Test
	public void testMain() {
		System.out.println("111111111111111111111");
		testGetSource();
		System.out.println("2222222222222222222222");
		testGetAllSource();
	}
}
