package org.labsystem.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.labsystem.domain.dao.iface.ProbelongDao;
import org.labsystem.domain.dao.iface.ProfessionaltitleDao;
import org.labsystem.domain.dao.iface.ProjectDao;
import org.labsystem.domain.dao.iface.StateDao;
import org.labsystem.domain.dao.iface.TeacherDao;
import org.labsystem.domain.entity.Probelong;
import org.labsystem.domain.entity.Project;
import org.labsystem.domain.entity.State;
import org.labsystem.domain.entity.Teacher;
import org.labsystem.domain.service.iface.FacultyService;
import org.labsystem.web.view.ProfessionalTitleView;
import org.labsystem.web.view.ProjectSimpleView;
import org.labsystem.web.view.StateView;
import org.labsystem.web.view.TeacherSimpleView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("FacultyService")
@Transactional
public class FacultyServiceImpl implements FacultyService {
	@Autowired
	private TeacherDao teacherDao;
	@Autowired
	private ProfessionaltitleDao professionaltitleDao;
	@Autowired
	private ProbelongDao probelongDao;
	@Autowired
	private ProjectDao projectDao;

	@Autowired
	private StateDao stateDao;

	@Override
	public List<TeacherSimpleView> getAllTeacherSimpeView(boolean isChinese) {
		List<Teacher> teachers = teacherDao.findAll();
		List<TeacherSimpleView> teacherSimpleViews = new ArrayList<>();
		for (Teacher teacher : teachers) {
			ProfessionalTitleView pv = new ProfessionalTitleView(professionaltitleDao.get(teacher.getProfsntitleId()),
					isChinese);
			TeacherSimpleView tmpTeacherSimpleView = new TeacherSimpleView(teacher, pv, isChinese);
			teacherSimpleViews.add(tmpTeacherSimpleView);
		}
		return teacherSimpleViews;
	}

	@Override
	public TeacherSimpleView getTeacherSimpleViewByTeacherID(int teacherID, boolean isChinese) {
		Teacher teacher = teacherDao.get(teacherID);
		ProfessionalTitleView pv = new ProfessionalTitleView(professionaltitleDao.get(teacher.getProfsntitleId()),
				isChinese);
		return new TeacherSimpleView(teacher, pv, isChinese);
	}

	@Override
	public List<ProjectSimpleView> getProjectViewsByTeacherID(int teacherID, boolean isChinese) {
		// 先获得Probelongs
		List<Probelong> rtProbelongs = probelongDao.getProbelongsByTeacher(teacherID);
		List<ProjectSimpleView> projectSimpleViews = new ArrayList<>();
		for (Probelong probelong : rtProbelongs) {
			Project project = projectDao.get(probelong.getProId());
			State state = stateDao.get(project.getProstateC());
			StateView stateView = new StateView(state, isChinese);
			ProjectSimpleView tmpView = new ProjectSimpleView(project, stateView, isChinese);
			projectSimpleViews.add(tmpView);
		}
		return projectSimpleViews;
	}

}
