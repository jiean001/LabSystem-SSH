package org.labsystem.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({@Result(name = "people", location = "/index/people.jsp"), })
public class TeacherAction extends BaseAction {
	@Action("people")
	public String people() {
		setLanguage(!getLanguage());
		return "people";
	}
}
