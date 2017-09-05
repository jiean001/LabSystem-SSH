package org.labsystem.domain.dao.iface;

import org.labsystem.domain.entity.Respro;

public interface ResproDao extends GenericDao<Respro, Integer> {
	Respro getRespro(int id);
}
