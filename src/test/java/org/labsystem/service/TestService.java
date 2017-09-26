package org.labsystem.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.labsystem.domain.entity.Researchfield;
import org.labsystem.domain.service.admin.iface.BaseService;
import org.labsystem.domain.service.user.iface.FacultyService;
import org.labsystem.domain.service.user.iface.LaboratoryInfoService;
import org.labsystem.domain.service.user.iface.LatestNewsService;
import org.labsystem.domain.service.user.iface.ResearchService;
import org.labsystem.domain.service.user.iface.StudentService;
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
	@Autowired
	private BaseService baseService;

	void testBaseService() {
		/*education background*/
		LOGGER.error("luxb_getAllEducationBackGroundViews" + JSON.toJSONString(baseService.getAllEducationBackGroundViews(true)));
		LOGGER.error("luxb_getEdubkgrd" + JSON.toJSONString(baseService.getEdubkgrd(1)));
		LOGGER.error("luxb_getEducationBackGroundView" + JSON.toJSONString(baseService.getEducationBackGroundView(1, true)));

		/*source*/
		LOGGER.error("luxb_getAllSourceViews" + JSON.toJSONString(baseService.getAllSourceViews(true)));
		LOGGER.error("luxb_getSourceView" + JSON.toJSONString(baseService.getSourceView(1, true)));
		LOGGER.error("luxb_getSource" + JSON.toJSONString(baseService.getSource(1)));
	}

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

		LOGGER.error("luxiongbo_testFacultyService_getTeacherSimpleViewByTeacherID"
				+ JSON.toJSONString(facultyService.getTeacherSimpleViewByTeacherID(1, true)));

		LOGGER.error("luxiongbo_testFacultyService_getProjectViewsByTeacherID"
				+ JSON.toJSONString(facultyService.getProjectViewsByTeacherID(1, true)));

		LOGGER.error("luxiongbo_testFacultyService_getPaperSimpleViewsByTeacherID"
				+ JSON.toJSONString(facultyService.getPaperSimpleViewsByTeacherID(1, true)));
	}

	@Test
	public void testMain() {
		//		testResearchService();
		//		testLaboratoryInfoService();
		testStudentSerive();
		//		testLatestNewsService();
		//		testFacultyService();
		//testBaseService();
	}

}
