package org.labsystem.web.view;

import org.labsystem.entity.Professionaltitle;

public class ProfessionalTitleView {
	private int profsnTitleId;
	private String profsnTitleName;

	public ProfessionalTitleView(Professionaltitle pt, boolean isChinese) {
		this.profsnTitleId = pt.getProfsntitleId();
		if (isChinese) {
			this.profsnTitleName = pt.getProfsntitlenameC();
		} else {
			this.profsnTitleName = pt.getProfsntitlenameE();
		}
	}

	public int getProfsnTitleId() {
		return profsnTitleId;
	}

	public String getProfsnTitleName() {
		return profsnTitleName;
	}
}
