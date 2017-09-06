package org.labsystem.web.action;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.labsystem.domain.service.iface.ResearchService;
import org.labsystem.web.view.ResearchFieldView;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionContext;


@Results({ @Result(name = "index", location = "/index.jsp"),
})
public class IndexAction extends BaseAction {
	private static final Logger LOGGER = Logger.getLogger(IndexAction.class);

	@Autowired
	private ResearchService researchService;

	@Action("index")
	public String index() {
		List<ResearchFieldView> list = researchService.getAllResearchFieldView(getLanguage());
		ActionContext.getContext().getValueStack().set("researchFieldList", list);
		//this.getServletRequest().setAttribute("researchFieldList", list);
		//session.setAttribute("researchFieldList", list);
		LOGGER.error("HAHA" + JSON.toJSON(list));
		return "index";
	}
}
