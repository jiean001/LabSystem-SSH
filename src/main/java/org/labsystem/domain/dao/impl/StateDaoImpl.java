package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.StateDao;
import org.labsystem.domain.entity.State;
import org.springframework.stereotype.Repository;

@Repository("StateDao")
public class StateDaoImpl extends GenericDaoImpl<State, Integer> implements StateDao {

	@Override
	public State select(State entity, Integer id) {
		return null;
	}

	@Override
	public Integer insert(State entity) {
		return null;
	}

	@Override
	public boolean update(State entity) {
		return false;
	}

	@Override
	public boolean delete(State entity) {
		return false;
	}

	@Override
	public List<State> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<State> states = this.getSession().createQuery("from State").list();
		return states;
	}

	@Override
	public State get(Integer id) {
		return this.getSession().get(State.class, id);
	}

}
