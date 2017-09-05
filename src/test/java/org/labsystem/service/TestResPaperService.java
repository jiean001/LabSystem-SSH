package org.labsystem.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "struts.xml" })
public class TestResPaperService {
	private static final Logger LOGGER = Logger.getLogger(TestResPaperService.class);

	@Test
	public void testMain() {
		//testGetPaperSimpleByResearch();
	}

}
