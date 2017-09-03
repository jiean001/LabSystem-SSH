package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.Edubkgrd;

public interface EdubkgrdService {
	Edubkgrd getEdubkgrd(int edubkgrdId);

	List<Edubkgrd> getAllEdubkgrd();
}
