package org.labsystem.domain.service.impl;

import org.labsystem.domain.dao.iface.LaboratoryInfoDao;
import org.labsystem.domain.service.iface.LaboratoryInfoService;
import org.labsystem.entity.LaboratoryInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("LaboratoryInfoService") // 注解为service层spring管理bean
@Transactional // 注解此类所有方法加入spring事务, 具体设置默认
public class LaboratoryInfoServiceImpl implements LaboratoryInfoService {
	@Autowired
	private LaboratoryInfoDao laboratoryInfoDao;

	@Override
	public LaboratoryInfo getLaboratoryInfo(int LaboratoryInfoId) {
		return laboratoryInfoDao.get(LaboratoryInfoId);
	}

	@Override
	public boolean modifyLaboratoryInfo(LaboratoryInfo entity) {
		return laboratoryInfoDao.update(entity);
	}

}
