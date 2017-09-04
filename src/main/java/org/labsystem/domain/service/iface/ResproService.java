package org.labsystem.domain.service.iface;

import org.labsystem.entity.Respro;

public interface ResproService {
	boolean addRespro(Respro entity);

	boolean modifyRespro(Respro entity);

	boolean deleteRespro(Respro entity);

	Respro getRespro(int id);
}
