package org.labsystem.domain.service.admin.impl;

import java.util.ArrayList;
import java.util.List;

import org.labsystem.domain.dao.iface.EdubkgrdDao;
import org.labsystem.domain.dao.iface.ProfessionaltitleDao;
import org.labsystem.domain.dao.iface.SourceDao;
import org.labsystem.domain.dao.iface.StateDao;
import org.labsystem.domain.dao.iface.SupervisortypeDao;
import org.labsystem.domain.entity.Edubkgrd;
import org.labsystem.domain.entity.Paper;
import org.labsystem.domain.entity.Paperbelong;
import org.labsystem.domain.entity.Professionaltitle;
import org.labsystem.domain.entity.Source;
import org.labsystem.domain.entity.State;
import org.labsystem.domain.entity.Supervisortype;
import org.labsystem.domain.service.admin.iface.BaseService;
import org.labsystem.util.Config;
import org.labsystem.web.user.view.EducationBackGroundView;
import org.labsystem.web.user.view.ProfessionalTitleView;
import org.labsystem.web.user.view.SourceView;
import org.labsystem.web.user.view.StateView;
import org.labsystem.web.user.view.SupervisorTypeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("BaseService")
@Transactional
public class BaseServiceImpl implements BaseService {
	@Autowired
	EdubkgrdDao edubkgrdDao;
	@Autowired
	SourceDao sourceDao;
	@Autowired
	ProfessionaltitleDao professionaltitleDao;
	@Autowired
	SupervisortypeDao supervisortypeDao;
	@Autowired
	StateDao stateDao;

	@Override
	public boolean checkLogin(int loginType, String userName, String password) {
		switch(loginType) {
		case Config.LOGIN_TYPE_ADMIN:
			if((userName == "admin") && (password == "123456"))
			{
				return true;
			}
			break;
		case Config.LOGIN_TYPE_STUDENT:
			if((userName == "student") && (password == "123456"))
			{
				return true;
			}
			break;
		case Config.LOGIN_TYPE_TEACHER:
			if((userName == "teacher") && (password == "123456"))
			{
				return true;
			}
			break;
		}
		return false;
	}

	@Override
	public List<EducationBackGroundView> getAllEducationBackGroundViews(boolean isChinese) {
		List<Edubkgrd> edubkgrds = edubkgrdDao.findAll();
		List<EducationBackGroundView> educationBackGroundViews = new ArrayList<>();
		for(Edubkgrd edubkgrd: edubkgrds) {
			educationBackGroundViews.add(new EducationBackGroundView(edubkgrd, isChinese));
		}
		return educationBackGroundViews;
	}

	@Override
	public Edubkgrd getEdubkgrd(int edubkgrdID) {
		return edubkgrdDao.get(edubkgrdID);
	}

	@Override
	public EducationBackGroundView getEducationBackGroundView(int edubkgrdID, boolean isChinese) {
		return new EducationBackGroundView(this.getEdubkgrd(edubkgrdID), isChinese);
	}

	@Override
	public List<ProfessionalTitleView> getAllProfessionalTitleViews(boolean isChinese) {
		List<Professionaltitle> professionaltitles = professionaltitleDao.findAll();
		List<ProfessionalTitleView> professionalTitleViews = new ArrayList<>();
		for(Professionaltitle professionaltitle: professionaltitles) {
			professionalTitleViews.add(new ProfessionalTitleView(professionaltitle, isChinese));
		}
		return professionalTitleViews;
	}

	@Override
	public Professionaltitle getProfessionaltitle(int professionaltitleID) {
		return professionaltitleDao.get(professionaltitleID);
	}

	@Override
	public ProfessionalTitleView getProfessionalTitleView(int professionaltitleID, boolean isChinese) {
		return new ProfessionalTitleView(this.getProfessionaltitle(professionaltitleID), isChinese);
	}

	@Override
	public List<SupervisorTypeView> getAllSupervisorTypeViews(boolean isChinses) {
		List<Supervisortype> supervisortypes = supervisortypeDao.findAll();
		List<SupervisorTypeView> supervisorTypeViews = new ArrayList<>();
		for(Supervisortype supervisortype: supervisortypes) {
			supervisorTypeViews.add(new SupervisorTypeView(supervisortype, isChinses));
		}
		return supervisorTypeViews;
	}

	@Override
	public Supervisortype getSupervisortype(int supervisortypeId) {
		return supervisortypeDao.get(supervisortypeId);
	}

	@Override
	public SupervisorTypeView getSupervisorTypeView(int supervisortypeId, boolean isChinese) {
		return new SupervisorTypeView(this.getSupervisortype(supervisortypeId), isChinese);
	}

	@Override
	public List<StateView> getAllStateViews(boolean isChinese) {
		List<State> states = stateDao.findAll();
		List<StateView> stateViews = new ArrayList<>();
		for(State state: states) {
			stateViews.add(new StateView(state, isChinese));
		}
		return stateViews;
	}

	@Override
	public State getState(int stateId) {
		return stateDao.get(stateId);
	}

	@Override
	public StateView getStateView(int stateId, boolean isChinese) {
		return new StateView(this.getState(stateId), isChinese);
	}

	@Override
	public List<SourceView> getAllSourceViews(boolean isChinese) {
		List<Source> sources = sourceDao.findAll();
		List<SourceView> sourceViews = new ArrayList<>();
		for(Source source: sources) {
			sourceViews.add(new SourceView(source, isChinese));
		}
		return sourceViews;
	}

	@Override
	public Source getSource(int sourceID) {
		return sourceDao.get(sourceID);
	}

	@Override
	public SourceView getSourceView(int sourceID, boolean isChinese) {
		return new SourceView(this.getSource(sourceID), isChinese);
	}



	@Override
	public boolean addPaper(Paper paper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePaper(Paper paper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePaper(Paper paper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPaperBelong(Paperbelong paperbelong) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePaperBelong(Paperbelong paperbelong) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePaperBelong(Paperbelong paperbelong) {
		// TODO Auto-generated method stub
		return false;
	}




}
