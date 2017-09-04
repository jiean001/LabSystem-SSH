package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.ResearchfieldDao;
import org.labsystem.domain.service.iface.ResearchfieldService;
import org.labsystem.domain.view.ResearchfieldView;
import org.labsystem.entity.Researchfield;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ResearchfieldService")
@Transactional
public class ResearchfieldServiceImpl implements ResearchfieldService {
	@Autowired
	private ResearchfieldDao researchfieldDao;

	@Override
	public Researchfield getResearchfield(int id) {
		return researchfieldDao.getResearchfield(id);
	}

	@Override
	public List<ResearchfieldView> getAllResearchfields(boolean isChinese) {
		return researchfieldDao.getAllResearchfields(isChinese);
	}

}
