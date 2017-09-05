package org.labsystem.domain.dao.iface;

import org.labsystem.domain.entity.Research;

public interface ResearchDao extends GenericDao<Research, Integer> {
	Research get(Integer id);
}
