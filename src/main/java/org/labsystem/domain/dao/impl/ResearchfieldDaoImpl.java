package org.labsystem.domain.dao.impl;

import org.labsystem.domain.dao.iface.ResearchfieldDao;
import org.labsystem.entity.Researchfield;
import org.springframework.stereotype.Repository;

@Repository("ResearchfieldDao")
public class ResearchfieldDaoImpl extends GenericDaoImpl<Researchfield, Integer> implements ResearchfieldDao {
	@Override
	public Researchfield getResearchfield(int id) {
		return this.getSession().get(Researchfield.class, id);
	}
}
