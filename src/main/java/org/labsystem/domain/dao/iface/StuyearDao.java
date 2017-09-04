package org.labsystem.domain.dao.iface;

import org.labsystem.entity.Stuyear;

public interface StuyearDao extends GenericDao<Stuyear, Integer> {
	Stuyear get(int id);
}
