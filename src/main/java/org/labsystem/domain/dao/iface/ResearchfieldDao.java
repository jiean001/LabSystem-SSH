package org.labsystem.domain.dao.iface;

import org.labsystem.entity.Researchfield;

public interface ResearchfieldDao extends GenericDao<Researchfield, Integer> {
	Researchfield getResearchfield(int id);
}
