package org.labsystem.domain.dao.iface;

import org.labsystem.domain.entity.Probelong;

public interface ProbelongDao extends GenericDao<Probelong, Integer> {
	Probelong get(Integer id);
}
