package org.labsystem.domain.dao.iface;

import org.labsystem.entity.Respaper;

public interface RespaperDao extends GenericDao<Respaper, Integer> {
	Respaper get(Integer id);
}
