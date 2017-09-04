package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.Professionaltitle;

public interface ProfessionaltitleService {
	Professionaltitle getProfessionaltitle(int ProfessionaltitleId);

	List<Professionaltitle> getAllProfessionaltitles();
}
