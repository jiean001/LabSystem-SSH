package org.labsystem.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.labsystem.domain.service.iface.LaboratoryInfoService;
import org.labsystem.entity.LaboratoryInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.alibaba.fastjson.JSON;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "struts.xml" })
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

	@Test
	public void testMain() {
		testGetLaboratoryInfo();
		testMofifyLaboratoryInfo();
		testGetLaboratoryInfo();
	}

}
