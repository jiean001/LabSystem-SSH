package org.labsystem.domain.dao.impl;

import org.labsystem.domain.dao.iface.LaboratoryInfoDao;
import org.labsystem.entity.LaboratoryInfo;
import org.springframework.stereotype.Repository;

@Repository("LaboratoryInfoDao")
public class LaboratoryInfoDaoImpl extends GenericDaoImpl<LaboratoryInfo, Integer> implements LaboratoryInfoDao {

	@Override
	public LaboratoryInfo get(Integer id) {
		return this.getSession().get(LaboratoryInfo.class, id);
	}

	@Override
	public boolean update(LaboratoryInfo entity) {
		return super.update(entity);
	}

	@Override
	public LaboratoryInfo select(LaboratoryInfo entity, Integer id) {
		return super.select(entity, id);
	}

	@Override
	public Integer insert(LaboratoryInfo entity) {
		return null;
	}

	@Override
	public boolean delete(LaboratoryInfo entity) {
		return false;
	}
}
