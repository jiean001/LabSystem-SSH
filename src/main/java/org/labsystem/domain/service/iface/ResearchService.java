package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.Researchfield;
import org.labsystem.web.view.ResearchDetailsView;
import org.labsystem.web.view.ResearchFieldView;

public interface ResearchService {
	List<ResearchFieldView> getAllResearchFieldView(boolean isChinese);

	List<ResearchDetailsView> getResearchDetailsViewByResearchField(Researchfield researchfield, boolean isChinese);

	Researchfield getResearchfield(int id);
}
