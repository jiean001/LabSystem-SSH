package org.labsystem.service;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.labsystem.domain.service.iface.ProjectService;
import org.labsystem.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.alibaba.fastjson.JSON;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "struts.xml" })
public class TestProjectService {
	private static final Logger LOGGER = Logger.getLogger(TestProjectService.class);

	@Autowired
	private ProjectService projectService;
	Project tmpProject;

	void testAddProject() {
		Project project = new Project("项目1", "project 1", 1, "这是项目1", "this is project 1", "国家项目", "guojiaxiagnmu",
				new Date(), new Date(), 100000);
		LOGGER.info("testAddProject: " + JSON.toJSONString(projectService.addProject(project)));
	}

	void testGetProject() {
		tmpProject = projectService.getProject(2);
		LOGGER.info("testGetProject" + JSON.toJSONString(tmpProject));
	}

	void testModifyProject() {
		System.out.println(tmpProject == null);
		tmpProject.setPronameC("张晨的项目");
		LOGGER.info("testModifyProject: " + JSON.toJSONString(projectService.modifyProject(tmpProject)));
	}

	void testGetAllProjects() {
		LOGGER.info("testGetAllProjects: " + JSON.toJSONString(projectService.getAllProjects()));
	}

	void testProject() {
		LOGGER.info("testProject: " + JSON.toJSONString(projectService.deleteProject(tmpProject)));
	}

	@Test
	public void testMain() {
		testAddProject();
		testGetProject();
		testModifyProject();
		testGetAllProjects();
		testProject();
	}

}
