package org.labsystem.dao.iface;

import org.labsystem.entity.Source;

public interface SourceDao extends GenericDao<Source, Integer> {
	Source get(Integer id);
}
