package org.labsystem.domain.dao.iface;

import java.util.List;

import org.labsystem.domain.entity.Reschfldres;
import org.labsystem.domain.entity.Researchfield;

public interface ReschfldresDao extends GenericDao<Reschfldres, Integer> {
	Reschfldres get(int id);

	List<Reschfldres> getReschfldresByReschfld(Researchfield entity);
}
