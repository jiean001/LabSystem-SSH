package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.service.iface.ResearchService;
import org.labsystem.web.view.ResearchFieldView;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ResearchService")
@Transactional
public class ResearchServiceImpl implements ResearchService {

	@Override
	public List<ResearchFieldView> getAllResearchFieldView(boolean isChinese) {
		return null;
	}

}
