package org.labsystem.domain.service.impl;

import org.labsystem.domain.dao.iface.LaboratoryInfoDao;
import org.labsystem.domain.service.iface.LaboratoryInfoService;
import org.labsystem.web.view.LaboratoryInfoView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("LaboratoryInfoService")
@Transactional
public class LaboratoryInfoServiceImpl implements LaboratoryInfoService {
	@Autowired
	private LaboratoryInfoDao laboratoryInfoDao;

	@Override
	public LaboratoryInfoView getLaboratoryInfoView(boolean isChinese) {
		// 只有一行数据，所以索引值为1
		return new LaboratoryInfoView(laboratoryInfoDao.get(1), isChinese);
	}

}
