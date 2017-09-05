package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.ResearchDao;
import org.labsystem.domain.entity.Research;
import org.springframework.stereotype.Repository;

@Repository("ResearchDao")
public class ResearchDaoImpl extends GenericDaoImpl<Research, Integer> implements ResearchDao {
	@Override
	public List<Research> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Research> researchs = this.getSession().createQuery("from Research").list();
		return researchs;
	}

	@Override
	public Research get(Integer id) {
		return this.getSession().get(Research.class, id);
	}

}
