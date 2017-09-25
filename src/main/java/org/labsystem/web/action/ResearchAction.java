package org.labsystem.web.action;


import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.labsystem.domain.entity.Researchfield;
import org.labsystem.domain.service.user.iface.ResearchService;
import org.labsystem.web.user.view.ResearchDetailsView;
import org.springframework.beans.factory.annotation.Autowired;

@Results({@Result(name = "research", location = "/index/research.jsp"), })
public class ResearchAction extends BaseAction {
	@Autowired
	private ResearchService researchService;

	private int reschfdID;
	private Researchfield researchField;
	//子领域的详细试图列表
	private List<ResearchDetailsView> researchDetailsViews;


	@Action("research")
	public String people() {
		this.researchField = researchService.getResearchfield(reschfdID);
		this.researchDetailsViews = researchService.getResearchDetailsViewByResearchField(researchField, getLanguage());
		return "research";
	}

	public int getReschfdID() {
		return reschfdID;
	}


	public void setReschfdID(int reschfdID) {
		this.reschfdID = reschfdID;
	}


	public Researchfield getResearchField() {
		return researchField;
	}


	public void setResearchField(Researchfield researchField) {
		this.researchField = researchField;
	}


	public List<ResearchDetailsView> getResearchDetailsViews() {
		return researchDetailsViews;
	}


	public void setResearchDetailsViews(List<ResearchDetailsView> researchDetailsViews) {
		this.researchDetailsViews = researchDetailsViews;
	}
}
