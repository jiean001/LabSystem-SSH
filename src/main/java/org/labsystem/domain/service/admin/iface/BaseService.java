package org.labsystem.domain.service.admin.iface;

import java.util.List;

import org.labsystem.domain.entity.Edubkgrd;
import org.labsystem.domain.entity.Paper;
import org.labsystem.domain.entity.Paperbelong;
import org.labsystem.domain.entity.Professionaltitle;
import org.labsystem.domain.entity.Source;
import org.labsystem.domain.entity.State;
import org.labsystem.domain.entity.Supervisortype;
import org.labsystem.web.user.view.EducationBackGroundView;
import org.labsystem.web.user.view.ProfessionalTitleView;
import org.labsystem.web.user.view.SourceView;
import org.labsystem.web.user.view.StateView;
import org.labsystem.web.user.view.SupervisorTypeView;

public interface BaseService {
	//login
	boolean checkLogin(int loginType, String userName, String password);

	/*read only table*/
	//学历
	List<EducationBackGroundView> getAllEducationBackGroundViews(boolean isChinese);
	Edubkgrd getEdubkgrd(int edubkgrdID);
	EducationBackGroundView getEducationBackGroundView(int edubkgrdID, boolean isChinese);

	//职称
	List<ProfessionalTitleView> getAllProfessionalTitleViews(boolean isChinese);
	Professionaltitle getProfessionaltitle(int professionaltitleID);
	ProfessionalTitleView getProfessionalTitleView(int professionaltitleID, boolean isChinese);

	//导师类型
	List<SupervisorTypeView> getAllSupervisorTypeViews(boolean isChinses);
	Supervisortype getSupervisortype(int supervisortypeId);
	SupervisorTypeView getSupervisorTypeView(int supervisortypeId, boolean isChinese);

	//state
	List<StateView> getAllStateViews(boolean isChinese);
	State getState(int stateId);
	StateView getStateView(int stateId, boolean isChinese);

	/*paper source*/
	List<SourceView> getAllSourceViews(boolean isChinese);
	Source getSource(int sourceID);
	SourceView getSourceView(int sourceID,  boolean isChinese);






	/*Paper--加论文，此时并没有加关系*/
	boolean addPaper(Paper paper);
	boolean updatePaper(Paper paper);
	boolean deletePaper(Paper paper);

	/*论文关系表--子类根据类型再次实现*/
	boolean addPaperBelong(Paperbelong paperbelong);
	boolean updatePaperBelong(Paperbelong paperbelong);
	boolean deletePaperBelong(Paperbelong paperbelong);
}
