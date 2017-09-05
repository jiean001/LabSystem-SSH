package org.labsystem.domain.dao.iface;

import java.util.List;

import org.labsystem.domain.entity.Research;
import org.labsystem.domain.entity.Respaper;

public interface RespaperDao extends GenericDao<Respaper, Integer> {
	Respaper get(Integer id);

	List<Respaper> getRespaperByResearch(Research research);
}
