package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.entity.Supervisortype;
import org.springframework.stereotype.Repository;

@Repository("SupervisortypeDao")
public class SupervisortypeDaoImpl extends GenericDaoImpl<Supervisortype, Integer>
		implements org.labsystem.domain.dao.iface.SupervisortypeDao {

	@Override
	public List<Supervisortype> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Supervisortype> supervisortypes = this.getSession().createQuery("from Supervisortype").list();
		return supervisortypes;
	}

	@Override
	public Supervisortype get(Integer id) {
		return this.getSession().get(Supervisortype.class, id);
	}

	@Override
	public Supervisortype select(Supervisortype entity, Integer id) {
		return super.select(entity, id);
	}

	@Override
	public Integer insert(Supervisortype entity) {
		return null;
	}

	@Override
	public boolean update(Supervisortype entity) {
		return false;
	}

	@Override
	public boolean delete(Supervisortype entity) {
		return false;
	}
}
