package org.labsystem.service;

import org.apache.log4j.Logger;
import org.labsystem.domain.service.iface.SupervisortypeService;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;

public class TestSupervisorTypeService {
	private static final Logger LOGGER = Logger.getLogger(TestSupervisorTypeService.class);

	@Autowired
	private SupervisortypeService supervisortypeService;

	void testGetSupervisortype() {
		LOGGER.info("getSupervisortype" + JSON.toJSONString(supervisortypeService.getSupervisortype(1)));
	}

	void testGetAllSupervisortype() {
		LOGGER.info("getAllSupervisortype" + JSON.toJSONString(supervisortypeService.getAllSupervisortype()));
	}

	public void testMain() {
		testGetSupervisortype();
		testGetAllSupervisortype();
	}

}
