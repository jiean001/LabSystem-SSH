package org.labsystem.domain.service.impl;

import org.labsystem.domain.dao.iface.RespaperDao;
import org.labsystem.domain.service.iface.RespaperService;
import org.labsystem.entity.Respaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("RespaperService")
@Transactional
public class RespaperServiceImpl implements RespaperService {
	@Autowired
	private RespaperDao respaperDao;

	@Override
	public boolean addRespaper(Respaper entity) {
		return respaperDao.insert(entity) > 0;
	}

	@Override
	public boolean modifyRespaper(Respaper entity) {
		return respaperDao.update(entity);
	}

	@Override
	public boolean deleteRespaper(Respaper entity) {
		return respaperDao.delete(entity);
	}

	@Override
	public Respaper getRespaper(int id) {
		return respaperDao.get(id);
	}

}
