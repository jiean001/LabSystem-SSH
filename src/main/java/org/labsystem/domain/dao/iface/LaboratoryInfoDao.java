package org.labsystem.domain.dao.iface;

import org.labsystem.domain.entity.LaboratoryInfo;

public interface LaboratoryInfoDao extends GenericDao<LaboratoryInfo, Integer> {
	LaboratoryInfo get(Integer id);
}
