package org.labsystem.domain.service.iface;

import org.labsystem.entity.Respaper;

public interface RespaperService {
	boolean addRespaper(Respaper entity);

	boolean modifyRespaper(Respaper entity);

	boolean deleteRespaper(Respaper entity);

	Respaper getRespaper(int id);

}
