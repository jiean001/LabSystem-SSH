package org.labsystem.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.labsystem.domain.service.iface.FacultyService;
import org.labsystem.domain.service.iface.LaboratoryInfoService;
import org.labsystem.domain.service.iface.LatestNewsService;
import org.labsystem.domain.service.iface.ResearchService;
import org.labsystem.web.view.LaboratoryInfoView;
import org.labsystem.web.view.NewsView;
import org.labsystem.web.view.ResearchFieldView;
import org.labsystem.web.view.TeacherSimpleView;
import org.springframework.beans.factory.annotation.Autowired;


@Results({ @Result(name = "index", location = "/index/index.jsp"),
})
public class IndexAction extends BaseAction {
	@Autowired
	private ResearchService researchService;
	@Autowired
	private LaboratoryInfoService laboratoryInfoService;
	@Autowired
	private FacultyService facultyService;
	@Autowired
	private LatestNewsService latestNewsService;


	private List<ResearchFieldView> researchFieldViews;
	private LaboratoryInfoView labInfoView;
	private List<TeacherSimpleView> teacherSimpleViews;
	private List<NewsView> newsViews;

	@Action("index")
	public String index() {
		setLanguage(!getLanguage());
		this.labInfoView = laboratoryInfoService.getLaboratoryInfoView(getLanguage());
		this.researchFieldViews = researchService.getAllResearchFieldView(getLanguage());
		this.teacherSimpleViews = facultyService.getAllTeacherSimpeView(getLanguage());
		this.newsViews = latestNewsService.getAllNewsViewsByTimeDesc(getLanguage());
		return "index";
	}

	public List<NewsView> getNewsViews() {
		return newsViews;
	}

	public void setNewsViews(List<NewsView> newsViews) {
		this.newsViews = newsViews;
	}

	public List<TeacherSimpleView> getTeacherSimpleViews() {
		return teacherSimpleViews;
	}

	public void setTeacherSimpleViews(List<TeacherSimpleView> teacherSimpleViews) {
		this.teacherSimpleViews = teacherSimpleViews;
	}

	public List<ResearchFieldView> getResearchFieldViews() {
		return researchFieldViews;
	}

	public void setResearchFieldViews(List<ResearchFieldView> researchFieldViews) {
		this.researchFieldViews = researchFieldViews;
	}

	public LaboratoryInfoView getLabInfoView() {
		return labInfoView;
	}

	public void setLabInfoView(LaboratoryInfoView labInfoView) {
		this.labInfoView = labInfoView;
	}
}
