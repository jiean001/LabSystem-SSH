package org.labsystem.domain.dao.iface;

import org.labsystem.domain.entity.Supervisortype;

public interface SupervisortypeDao extends GenericDao<Supervisortype, Integer> {
	Supervisortype get(Integer id);
}
