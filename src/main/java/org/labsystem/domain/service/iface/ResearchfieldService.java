package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.domain.view.ResearchfieldView;
import org.labsystem.entity.Researchfield;

public interface ResearchfieldService {
	Researchfield getResearchfield(int id);

	List<ResearchfieldView> getAllResearchfields(boolean isChinese);
}
