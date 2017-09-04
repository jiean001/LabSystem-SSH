package org.labsystem.service;

import org.apache.log4j.Logger;
import org.labsystem.domain.service.iface.LaboratoryInfoService;
import org.labsystem.entity.LaboratoryInfo;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;

public class TestLaboratoryInfoService {
	private static final Logger LOGGER = Logger.getLogger(TestLaboratoryInfoService.class);

	@Autowired
	private LaboratoryInfoService laboratoryInfoService;
	LaboratoryInfo info;

	void testGetLaboratoryInfo() {
		this.info = laboratoryInfoService.getLaboratoryInfo(1);
		LOGGER.info("testGetLaboratoryInfo" + JSON.toJSONString(this.info));

	}

	void testMofifyLaboratoryInfo() {
		this.info.setLaboratorytitleC("朱安娜");
		LOGGER.info(
				"testMofifyLaboratoryInfo" + JSON.toJSONString(laboratoryInfoService.modifyLaboratoryInfo(this.info)));
	}

	public void testMain() {
		testGetLaboratoryInfo();
		testMofifyLaboratoryInfo();
		testGetLaboratoryInfo();
	}

}
