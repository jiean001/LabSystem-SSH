package org.labsystem.domain.dao.iface;

import org.labsystem.entity.Edubkgrd;

public interface EdubkgrdDao extends GenericDao<Edubkgrd, Integer> {
	Edubkgrd get(Integer id);
}
