package org.labsystem.domain.dao.iface;

import org.labsystem.domain.entity.Resbelong;

public interface ResbelongDao extends GenericDao<Resbelong, Integer> {
	Resbelong get(Integer id);
}
