package org.labsystem.domain.service.admin.iface;

import java.util.List;

import org.labsystem.domain.entity.Edubkgrd;
import org.labsystem.domain.entity.Paper;
import org.labsystem.domain.entity.Paperbelong;
import org.labsystem.domain.entity.Source;
import org.labsystem.web.user.view.EducationBackGroundView;
import org.labsystem.web.user.view.SourceView;

public interface BaseService {
	//获得所有的学历
	List<EducationBackGroundView> getAllEducationBackGroundViews();
	//获得学历
	Edubkgrd getEdubkgrd(int edubkgrdID);
	//获得学历视图
	EducationBackGroundView getEducationBackGroundView(int edubkgrdID, boolean isChinese);

	/*职称表*/



	/*paper source*/
	List<SourceView> getAllSourceViews();
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
