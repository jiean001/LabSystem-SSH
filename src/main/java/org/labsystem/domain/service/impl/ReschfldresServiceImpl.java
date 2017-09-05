package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.ReschfldresDao;
import org.labsystem.domain.service.iface.ReschfldresService;
import org.labsystem.domain.view.ResearchDetailsView;
import org.labsystem.entity.Research;
import org.labsystem.entity.Researchfield;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ReschfldresService")
@Transactional
public class ReschfldresServiceImpl implements ReschfldresService {
	@Autowired
	private ReschfldresDao reschfldResDao;

	@Override
	public List<Research> getResearchByResearchField(Researchfield entity) {
		return reschfldResDao.getResearchsByReschfld(entity);
	}

	@Override
	public List<ResearchDetailsView> getResearchDetailsViewByResearchfield(Researchfield entity, boolean isChinese) {
		return reschfldResDao.getResearchDetailsViewByResearchfield(entity, isChinese);
	}
}
