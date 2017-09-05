package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.domain.view.ResearchDetailsView;
import org.labsystem.entity.Research;
import org.labsystem.entity.Researchfield;

public interface ReschfldresService {
	List<Research> getResearchByResearchField(Researchfield entity);

	List<ResearchDetailsView> getResearchDetailsViewByResearchfield(Researchfield entity, boolean isChinese);
}
