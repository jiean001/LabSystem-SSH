package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.Reschfldres;
import org.labsystem.entity.Research;

public interface ReschfldresService {
	List<Research> getResearchByResearchField(Reschfldres entity);
}
