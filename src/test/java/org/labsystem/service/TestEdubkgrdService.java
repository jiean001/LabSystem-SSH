package org.labsystem.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.labsystem.domain.service.iface.EdubkgrdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.alibaba.fastjson.JSON;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "struts.xml" })
public class TestEdubkgrdService {
	private static final Logger LOGGER = Logger.getLogger(TestEdubkgrdService.class);

	@Autowired
	private EdubkgrdService edubkgrdService;

	void testGetEdubkgrd() {
		LOGGER.info("testGetEdubkgrd" + JSON.toJSONString(edubkgrdService.getEdubkgrd(1)));
	}

	void testGetAllEdubkgrd() {
		LOGGER.info("testGetAllEdubkgrd" + JSON.toJSONString(edubkgrdService.getAllEdubkgrd()));
	}

	@Test
	public void testMain() {
		testGetEdubkgrd();
		testGetAllEdubkgrd();
	}

}
