package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.StateDao;
import org.labsystem.domain.service.iface.StateService;
import org.labsystem.entity.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("StateService")
@Transactional
public class StateServiceImpl implements StateService {
	@Autowired
	private StateDao stateDao;

	@Override
	public State getState(int id) {
		return stateDao.get(id);
	}

	@Override
	public List<State> getAllStates() {
		return stateDao.findAll();
	}

}
