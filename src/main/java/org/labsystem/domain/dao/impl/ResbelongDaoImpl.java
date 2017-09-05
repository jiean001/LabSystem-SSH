package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.ResbelongDao;
import org.labsystem.domain.entity.Resbelong;
import org.springframework.stereotype.Repository;

@Repository("ResbelongDao")
public class ResbelongDaoImpl extends GenericDaoImpl<Resbelong, Integer> implements ResbelongDao {
	@Override
	public List<Resbelong> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Resbelong> resbelongs = this.getSession().createQuery("from Resbelong").list();
		return resbelongs;
	}

	@Override
	public Resbelong get(Integer id) {
		return this.getSession().get(Resbelong.class, id);
	}

}
