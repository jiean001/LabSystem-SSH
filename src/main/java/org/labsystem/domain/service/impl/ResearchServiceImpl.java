package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.ResearchDao;
import org.labsystem.domain.service.iface.ResearchService;
import org.labsystem.entity.Research;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ResearchService")
@Transactional
public class ResearchServiceImpl implements ResearchService {
	@Autowired
	private ResearchDao researchDao;

	@Override
	public List<Research> getAllResearch() {
		return researchDao.findAll();
	}

	@Override
	public boolean addResearch(Research entity) {
		return researchDao.insert(entity) > 0;
	}

	@Override
	public boolean modifyResearch(Research entity) {
		return researchDao.update(entity);
	}

	@Override
	public boolean deleteResearch(Research entity) {
		return researchDao.delete(entity);
	}

	@Override
	public Research getResearch(int id) {
		return researchDao.get(id);
	}
}
