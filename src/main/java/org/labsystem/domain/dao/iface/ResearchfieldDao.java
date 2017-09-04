package org.labsystem.domain.dao.iface;

import java.util.List;

import org.labsystem.domain.view.ResearchfieldView;
import org.labsystem.entity.Researchfield;

public interface ResearchfieldDao extends GenericDao<Researchfield, Integer> {
	Researchfield getResearchfield(int id);

	//获得全部领域
	List<ResearchfieldView> getAllResearchfields(boolean isChinese);

}
