package org.labsystem.domain.service.impl;

import org.labsystem.domain.dao.iface.ResproDao;
import org.labsystem.domain.service.iface.ResproService;
import org.labsystem.entity.Respro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ResproService")
@Transactional
public class ResproServiceImpl implements ResproService {
	@Autowired
	private ResproDao resproDao;

	@Override
	public boolean addRespro(Respro entity) {
		return resproDao.insert(entity) > 0;
	}

	@Override
	public boolean modifyRespro(Respro entity) {
		return resproDao.update(entity);
	}

	@Override
	public boolean deleteRespro(Respro entity) {
		return resproDao.delete(entity);
	}

	@Override
	public Respro getRespro(int id) {
		return resproDao.getRespro(id);
	}

}
