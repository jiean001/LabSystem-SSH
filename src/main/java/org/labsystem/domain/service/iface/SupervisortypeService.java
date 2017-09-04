package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.Supervisortype;

public interface SupervisortypeService {
	Supervisortype getSupervisortype(int SupervisortypeId);

	List<Supervisortype> getAllSupervisortype();
}
