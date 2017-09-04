package org.labsystem.domain.dao.iface;

import org.labsystem.entity.Paperbelong;

public interface PaperbelongDao extends GenericDao<Paperbelong, Integer> {
	Paperbelong get(Integer id);
}
