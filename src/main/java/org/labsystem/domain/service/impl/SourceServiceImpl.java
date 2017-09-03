package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.dao.iface.SourceDao;
import org.labsystem.domain.service.iface.SourceService;
import org.labsystem.entity.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("SourceService")
@Transactional
public class SourceServiceImpl implements SourceService {
	@Autowired
	private SourceDao SourceDao;

	@Override
	public Source getSource(int sourceId) {
		return SourceDao.get(sourceId);
	}

	@Override
	public List<Source> getAllSource() {
		return SourceDao.findAll();
	}

}
