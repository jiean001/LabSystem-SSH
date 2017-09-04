package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.Research;

public interface ResearchService {
	List<Research> getAllResearch();

	Research getResearch(int id);

	boolean addResearch(Research entity);

	boolean modifyResearch(Research entity);

	boolean deleteResearch(Research entity);
}
