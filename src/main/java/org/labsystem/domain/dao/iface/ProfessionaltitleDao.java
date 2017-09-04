package org.labsystem.domain.dao.iface;

import org.labsystem.entity.Professionaltitle;

public interface ProfessionaltitleDao extends GenericDao<Professionaltitle, Integer> {
	Professionaltitle get(Integer id);
}
