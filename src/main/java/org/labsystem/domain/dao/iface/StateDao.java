package org.labsystem.domain.dao.iface;

import org.labsystem.domain.entity.State;

public interface StateDao extends GenericDao<State, Integer> {
	State get(Integer id);
}
