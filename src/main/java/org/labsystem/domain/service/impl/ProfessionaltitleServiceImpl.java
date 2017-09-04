package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.ProfessionaltitleDao;
import org.labsystem.domain.service.iface.ProfessionaltitleService;
import org.labsystem.entity.Professionaltitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ProfessionaltitleService")
@Transactional
public class ProfessionaltitleServiceImpl implements ProfessionaltitleService {
	@Autowired
	private ProfessionaltitleDao professionaltitleDao;

	@Override
	public Professionaltitle getProfessionaltitle(int ProfessionaltitleId) {
		return professionaltitleDao.get(ProfessionaltitleId);
	}

	@Override
	public List<Professionaltitle> getAllProfessionaltitles() {
		return professionaltitleDao.findAll();
	}

}
