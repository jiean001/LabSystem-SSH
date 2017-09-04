package org.labsystem.domain.dao.iface;

import org.labsystem.entity.Source;

public interface SourceDao extends GenericDao<Source, Integer> {
	Source get(Integer id);
}
