package org.labsystem.dao.iface;

import org.labsystem.entity.Supervisortype;

public interface SupervisortypeDao extends GenericDao<Supervisortype, Integer> {
	Supervisortype get(Integer id);
}
