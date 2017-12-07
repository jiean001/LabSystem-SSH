package org.labsystem.web.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
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

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionContext;

import net.sf.json.JSONArray;


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
	//language
	private boolean crtLanguage;

	private List<StudentSimplyView> internationalStuViews;
	private List<StudentSimplyView> phdStuViews;
	private List<StudentSimplyView> masterStuViews;

	private static Log LOGGER = LogFactory.getLog("runLogger");

	@Action("index")
	public String index() {
		//Map存储json数据
		//Map<String, Object> info = new HashMap<String, Object>();
		String year = ServletActionContext.getRequest().getParameter("year");
		this.labInfoView = laboratoryInfoService.getLaboratoryInfoView(getLanguage());
		this.researchFieldViews = researchService.getAllResearchFieldView(getLanguage());
		this.teacherSimpleViews = facultyService.getAllTeacherSimpeView(getLanguage());
		this.newsViews = latestNewsService.getAllNewsViewsByTimeDesc(getLanguage());
		this.allYears = studentService.getAllYears();
		//		//JSONObject object =JSONObject.fromObject(year);
		//		runLog.error("dshgkhkgdalgsklaglakgls-----sdfsfd-------" + year);
		updateStu(Config.DEFAULTYEARS);
		LOGGER.error(
				"luxiongbo_testStudentSerive2" + JSON.toJSONString(this.studentViews));

		LOGGER.error(
				"luxiongbo_testStudentSerive3" + JSON.toJSONString(this.masterStuViews));

		LOGGER.error(
				"luxiongbo_testStudentSerive4" + JSON.toJSONString(this.internationalStuViews));

		LOGGER.error(
				"luxiongbo_testStudentSerive5" + JSON.toJSONString(this.phdStuViews));
		LOGGER.error(
				"lzh--" + JSON.toJSONString(year));
		return "index";
	}

	@Action("ajaxt")
	public String ajaxReturn() throws IOException {

		String year = ServletActionContext.getRequest().getParameter("year");
		updateStu(year==null?Config.DEFAULTYEARS:year);
		JSONArray stuArray = JSONArray.fromObject(studentViews);
		HttpServletResponse response = (HttpServletResponse) ActionContext.getContext().get(ServletActionContext.HTTP_RESPONSE);
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(stuArray);
		//		LOGGER.error(
		//				"lzh--" + JSON.toJSONString(masterStuViews));
		return null;
	}

	@Action("exchangeL")
	public String exchangeL() {
		setLanguage(!getLanguage());
		setCrtLanguage(getLanguage());
		return index();
	}

	public void updateStu(String year) {
		LOGGER.error("year--:" + year);
		//year = year.trim();
		this.studentViews = studentService.getStudentsByYear(year, getLanguage());
		this.internationalStuViews = studentService.getInternaltionalStudentsByYear(year, getLanguage());
		this.phdStuViews = studentService.getPHDStudentsByYear(year, getLanguage());
		this.masterStuViews = studentService.getMasterStudentsByYear(year, getLanguage());
	}

	public boolean isCrtLanguage() {
		return crtLanguage;
	}

	public void setCrtLanguage(boolean crtLanguage) {
		this.crtLanguage = crtLanguage;
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

	public List<StudentSimplyView> getInternationalStuViews() {
		return internationalStuViews;
	}

	public List<StudentSimplyView> getPhdStuViews() {
		return phdStuViews;
	}

	public ResearchService getResearchService() {
		return researchService;
	}

	public void setResearchService(ResearchService researchService) {
		this.researchService = researchService;
	}

	public void setInternationalStuViews(List<StudentSimplyView> internationalStuViews) {
		this.internationalStuViews = internationalStuViews;
	}

	public void setPhdStuViews(List<StudentSimplyView> phdStuViews) {
		this.phdStuViews = phdStuViews;
	}

	public List<StudentSimplyView> getMasterStuViews() {
		return masterStuViews;
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
