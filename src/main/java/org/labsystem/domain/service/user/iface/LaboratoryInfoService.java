package org.labsystem.domain.service.user.iface;

import org.labsystem.web.user.view.LaboratoryInfoView;

public interface LaboratoryInfoService {
	LaboratoryInfoView getLaboratoryInfoView(boolean isChinese);
}
