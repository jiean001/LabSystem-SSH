package org.labsystem.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({ @Result(name = "index", location = "/index.jsp"),
})
public class IndexAction extends BaseAction {
	@Action("index")
	public String index() {
		return "index";
	}
}
