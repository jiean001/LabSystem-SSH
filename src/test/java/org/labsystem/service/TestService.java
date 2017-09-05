package org.labsystem.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.labsystem.domain.service.iface.FacultyService;
import org.labsystem.domain.service.iface.LaboratoryInfoService;
import org.labsystem.domain.service.iface.LatestNewsService;
import org.labsystem.domain.service.iface.ResearchService;
import org.labsystem.domain.service.iface.StudentService;
import org.labsystem.entity.Researchfield;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.alibaba.fastjson.JSON;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "struts.xml" })
public class TestService {
	private static final Logger LOGGER = Logger.getLogger(TestService.class);

	@Autowired
	private ResearchService researchService;
	@Autowired
	private LaboratoryInfoService laboratoryInfoService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private LatestNewsService latestNewsService;
	@Autowired
	private FacultyService facultyService;

	void testResearchService() {
		LOGGER.error(
				"luxiongbo_testResearchService1" + JSON.toJSONString(researchService.getAllResearchFieldView(false)));

		Researchfield researchfield = researchService.getResearchfield(1);
		LOGGER.error("luxiongbo_testResearchService2" + JSON.toJSONString(researchfield));

		LOGGER.error("luxiongbo_testResearchService3"
				+ JSON.toJSONString(researchService.getResearchDetailsViewByResearchField(researchfield, true)));
	}

	void testLaboratoryInfoService() {
		LOGGER.error("luxiongbo_testLaboratoryInfoService"
				+ JSON.toJSONString(laboratoryInfoService.getLaboratoryInfoView(true)));
	}

	void testStudentSerive() {
		LOGGER.error("luxiongbo_testStudentSerive1" + JSON.toJSONString(studentService.getAllYears()));

		LOGGER.error(
				"luxiongbo_testStudentSerive2" + JSON.toJSONString(studentService.getStudentsByYear("2017", true)));
	}

	void testLatestNewsService() {
		LOGGER.error("luxiongbo_testLatestNewsService"
				+ JSON.toJSONString(latestNewsService.getAllNewsViewsByTimeDesc(true)));
	}

	void testFacultyService() {
		LOGGER.error("luxiongbo_testFacultyService1" + JSON.toJSONString(facultyService.getAllTeacherSimpeView(true)));
	}

	@Test
	public void testMain() {
		// testResearchService();
		// testLaboratoryInfoService();
		// testStudentSerive();
		// testLatestNewsService();
		testFacultyService();
	}

}
