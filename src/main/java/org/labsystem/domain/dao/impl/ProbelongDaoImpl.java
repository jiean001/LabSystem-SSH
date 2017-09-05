package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.ProbelongDao;
import org.labsystem.domain.entity.Probelong;
import org.springframework.stereotype.Repository;

@Repository("ProbelongDao")
public class ProbelongDaoImpl extends GenericDaoImpl<Probelong, Integer> implements ProbelongDao {
	@Override
	public List<Probelong> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Probelong> probelongs = this.getSession().createQuery("from Probelong").list();
		return probelongs;
	}

	@Override
	public Probelong get(Integer id) {
		return this.getSession().get(Probelong.class, id);
	}

}
