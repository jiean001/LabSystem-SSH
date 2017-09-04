package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.StuyearDao;
import org.labsystem.entity.Stuyear;
import org.springframework.stereotype.Repository;

@Repository("StuyearDao")
public class StuyearDaoImpl extends GenericDaoImpl<Stuyear, Integer> implements StuyearDao {
	@Override
	public List<Stuyear> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Stuyear> stuyears = this.getSession().createQuery("from Stuyear").list();
		return stuyears;
	}

	@Override
	public Stuyear get(int id) {
		return this.getSession().get(Stuyear.class, id);
	}

}
