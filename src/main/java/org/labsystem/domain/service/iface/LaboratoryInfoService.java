package org.labsystem.domain.service.iface;

import org.labsystem.entity.LaboratoryInfo;

public interface LaboratoryInfoService {
	LaboratoryInfo getLaboratoryInfo(int LaboratoryInfoId);

	boolean modifyLaboratoryInfo(LaboratoryInfo entity);
}
