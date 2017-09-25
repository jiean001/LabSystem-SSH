package org.labsystem.domain.service.user.iface;

import java.util.List;

import org.labsystem.domain.entity.Researchfield;
import org.labsystem.web.user.view.ResearchDetailsView;
import org.labsystem.web.user.view.ResearchFieldView;

public interface ResearchService {
	List<ResearchFieldView> getAllResearchFieldView(boolean isChinese);

	List<ResearchDetailsView> getResearchDetailsViewByResearchField(Researchfield researchfield, boolean isChinese);

	Researchfield getResearchfield(int id);
}
