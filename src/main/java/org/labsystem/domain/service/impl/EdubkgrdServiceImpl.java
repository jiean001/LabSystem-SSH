package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.EdubkgrdDao;
import org.labsystem.domain.service.iface.EdubkgrdService;
import org.labsystem.entity.Edubkgrd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("EdubkgrdService")
@Transactional
public class EdubkgrdServiceImpl implements EdubkgrdService {
	@Autowired
	private EdubkgrdDao edubkgrdDao;

	@Override
	public Edubkgrd getEdubkgrd(int edubkgrdId) {
		return edubkgrdDao.get(edubkgrdId);
	}

	@Override
	public List<Edubkgrd> getAllEdubkgrd() {
		return edubkgrdDao.findAll();
	}

}
