package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.service.iface.ReschfldresService;
import org.labsystem.entity.Reschfldres;
import org.labsystem.entity.Research;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ReschfldresService")
@Transactional
public class ReschfldresServiceImpl implements ReschfldresService {

	@Override
	public List<Research> getResearchByResearchField(Reschfldres entity) {
		return null;
	}
}
