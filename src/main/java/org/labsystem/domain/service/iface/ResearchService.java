package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.web.view.ResearchFieldView;

public interface ResearchService {
	List<ResearchFieldView> getAllResearchFieldView(boolean isChinese);
}
