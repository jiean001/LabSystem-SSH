package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.Researchfield;

public interface ResearchfieldService {
	List<Researchfield> getAllResearchfields();

	Researchfield getResearchfield(int id);
}
