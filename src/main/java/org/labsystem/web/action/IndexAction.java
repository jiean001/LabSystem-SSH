package org.labsystem.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.labsystem.domain.service.user.iface.FacultyService;
import org.labsystem.domain.service.user.iface.LaboratoryInfoService;
import org.labsystem.domain.service.user.iface.LatestNewsService;
import org.labsystem.domain.service.user.iface.ResearchService;
import org.labsystem.domain.service.user.iface.StudentService;
import org.labsystem.util.Config;
import org.labsystem.web.user.view.LaboratoryInfoView;
import org.labsystem.web.user.view.NewsView;
import org.labsystem.web.user.view.ResearchFieldView;
import org.labsystem.web.user.view.StudentSimplyView;
import org.labsystem.web.user.view.TeacherSimpleView;
import org.springframework.beans.factory.annotation.Autowired;

@Results({ @Result(name = "index", location = "/index/index.jsp")})
public class IndexAction extends BaseAction {
	@Autowired
	private ResearchService researchService;
	@Autowired
	private LaboratoryInfoService laboratoryInfoService;
	@Autowired
	private FacultyService facultyService;
	@Autowired
	private LatestNewsService latestNewsService;
	@Autowired
	private StudentService studentService;

	//研究领域
	private List<ResearchFieldView> researchFieldViews;
	//实验室信息
	private LaboratoryInfoView labInfoView;
	//老师信息
	private List<TeacherSimpleView> teacherSimpleViews;
	//新闻
	private List<NewsView> newsViews;
	//年份
	private List<String> allYears;
	//学生
	private List<StudentSimplyView> studentViews;


	@Action("index")
	public String index() {
		setLanguage(!getLanguage());
		this.labInfoView = laboratoryInfoService.getLaboratoryInfoView(getLanguage());
		this.researchFieldViews = researchService.getAllResearchFieldView(getLanguage());
		this.teacherSimpleViews = facultyService.getAllTeacherSimpeView(getLanguage());
		this.newsViews = latestNewsService.getAllNewsViewsByTimeDesc(getLanguage());
		this.allYears = studentService.getAllYears();
		this.studentViews = studentService.getStudentsByYear(Config.DEFAULTYEARS, getLanguage());
		return "index";
	}

	public List<String> getAllYears() {
		return allYears;
	}

	public void setAllYears(List<String> allYears) {
		this.allYears = allYears;
	}

	public List<StudentSimplyView> getStudentViews() {
		return studentViews;
	}

	public void setStudentViews(List<StudentSimplyView> studentViews) {
		this.studentViews = studentViews;
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
