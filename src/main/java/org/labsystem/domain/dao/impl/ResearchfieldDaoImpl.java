package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.ResearchfieldDao;
import org.labsystem.entity.Researchfield;
import org.springframework.stereotype.Repository;

@Repository("ResearchfieldDao")
public class ResearchfieldDaoImpl extends GenericDaoImpl<Researchfield, Integer> implements ResearchfieldDao {
	@Override
	public List<Researchfield> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Researchfield> researchfields = this.getSession().createQuery("from Researchfield").list();
		return researchfields;
	}

	@Override
	public Researchfield getResearchfield(int id) {
		return this.getSession().get(Researchfield.class, id);
	}

}
