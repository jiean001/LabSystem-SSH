package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.SupervisortypeDao;
import org.labsystem.domain.service.iface.SupervisortypeService;
import org.labsystem.entity.Supervisortype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("SupervisortypeService")
@Transactional
public class SupervisortypeServieImpl implements SupervisortypeService {
	@Autowired
	private SupervisortypeDao supervisortypeDao;

	@Override
	public Supervisortype getSupervisortype(int SupervisortypeId) {
		return supervisortypeDao.get(SupervisortypeId);
	}

	@Override
	public List<Supervisortype> getAllSupervisortype() {
		return supervisortypeDao.findAll();
	}

}
