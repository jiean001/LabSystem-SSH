package org.labsystem.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.labsystem.domain.service.iface.FacultyService;
import org.labsystem.web.view.PaperSimpleView;
import org.labsystem.web.view.ProjectSimpleView;
import org.labsystem.web.view.TeacherSimpleView;
import org.springframework.beans.factory.annotation.Autowired;

@Results({@Result(name = "people", location = "/index/people.jsp"), })
public class TeacherAction extends BaseAction {
	@Autowired
	private FacultyService facultyService;
	
	//老师的基本信息
	private TeacherSimpleView teacherView;
	//项目信息
	private List<ProjectSimpleView> projectSimpleViews;
	//论文信息
	private List<PaperSimpleView> paperSimpleViews;
	
	@Action("people")
	public String people() {
		setLanguage(!getLanguage());
		int teacherID = 1;
		this.teacherView = facultyService.getTeacherSimpleViewByTeacherID(teacherID, getLanguage());
		this.projectSimpleViews = facultyService.getProjectViewsByTeacherID(teacherID, getLanguage());
		this.paperSimpleViews = facultyService.getPaperSimpleViewsByTeacherID(teacherID, getLanguage());
		return "people";
	}
	
	public TeacherSimpleView getTeacherView() {
		return teacherView;
	}

	public void setTeacherView(TeacherSimpleView teacherView) {
		this.teacherView = teacherView;
	}

	public List<ProjectSimpleView> getProjectSimpleViews() {
		return projectSimpleViews;
	}

	public void setProjectSimpleViews(List<ProjectSimpleView> projectSimpleViews) {
		this.projectSimpleViews = projectSimpleViews;
	}

	public List<PaperSimpleView> getPaperSimpleViews() {
		return paperSimpleViews;
	}

	public void setPaperSimpleViews(List<PaperSimpleView> paperSimpleViews) {
		this.paperSimpleViews = paperSimpleViews;
	}
}
