package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.Source;

public interface SourceService {
	Source getSource(int sourceId);

	List<Source> getAllSource();

}
