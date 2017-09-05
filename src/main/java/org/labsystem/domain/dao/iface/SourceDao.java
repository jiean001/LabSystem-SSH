package org.labsystem.domain.dao.iface;

import org.labsystem.domain.entity.Source;

public interface SourceDao extends GenericDao<Source, Integer> {
	Source get(Integer id);
}
