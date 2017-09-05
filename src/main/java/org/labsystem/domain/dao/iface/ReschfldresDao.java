package org.labsystem.domain.dao.iface;

import java.util.List;

import org.labsystem.entity.Reschfldres;
import org.labsystem.entity.Research;
import org.labsystem.entity.Researchfield;

public interface ReschfldresDao extends GenericDao<Reschfldres, Integer> {
	Reschfldres get(int id);

	List<Research> getResearchsByReschfld(Researchfield entity);
}
