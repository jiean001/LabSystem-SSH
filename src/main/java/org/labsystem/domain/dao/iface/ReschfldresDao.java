package org.labsystem.domain.dao.iface;

import org.labsystem.entity.Reschfldres;

public interface ReschfldresDao extends GenericDao<Reschfldres, Integer> {
	Reschfldres get(int id);
}
