package org.labsystem.service;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.labsystem.domain.service.iface.PaperService;
import org.labsystem.entity.Paper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.alibaba.fastjson.JSON;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "struts.xml" })
public class TestPaperService {
	private static final Logger LOGGER = Logger.getLogger(TestPaperService.class);

	@Autowired
	private PaperService paperService;

	void tstAdd() {
		Paper paper = new Paper("论文1", "paper1", "简介", "biref introduction", "http://www.baidu.com", 1, 1, new Date());
		LOGGER.info(" paperService.addPaper(paper) " + paperService.addPaper(paper));
	}

	void tstGetAll() {

	}

	@Test
	public void checkUser() {
		List<Paper> papers = paperService.getAllPaper();
		LOGGER.info(JSON.toJSONString(papers));
	}

}
