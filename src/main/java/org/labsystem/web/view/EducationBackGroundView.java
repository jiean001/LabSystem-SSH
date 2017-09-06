package org.labsystem.web.view;

import org.labsystem.domain.entity.Edubkgrd;

//学历的视图，只有id和mame
public class EducationBackGroundView {
	private int edubkgrdId;
	private String edubkgrdName;

	public EducationBackGroundView(Edubkgrd edubkgrd, boolean isChinese) {
		this.edubkgrdId = edubkgrd.getEdubkgrdId();
		if (isChinese) {
			this.edubkgrdName = edubkgrd.getEdubkgrdnameC();
		} else {
			this.edubkgrdName = edubkgrd.getEdubkgrdnameE();
		}
	}

	public int getEdubkgrdId() {
		return edubkgrdId;
	}

	public String getEdubkgrdName() {
		return edubkgrdName;
	}
}
