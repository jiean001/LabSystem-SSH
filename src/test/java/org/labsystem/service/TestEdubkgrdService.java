package org.labsystem.service;

import org.apache.log4j.Logger;
import org.labsystem.domain.service.iface.EdubkgrdService;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;

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

	public void testMain() {
		testGetEdubkgrd();
		testGetAllEdubkgrd();
	}

}
