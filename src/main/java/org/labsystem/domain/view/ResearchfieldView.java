package org.labsystem.domain.view;

import org.labsystem.entity.Researchfield;

public class ResearchfieldView {
	private Integer researchfieldId;
	private String researchFieldName;

	public ResearchfieldView(Researchfield researchfield, boolean isChinese) {
		this.researchfieldId = researchfield.getResearchfieldId();
		if(isChinese) {
			this.researchFieldName = researchfield.getResearchfieldnameC();
		} else {
			this.researchFieldName = researchfield.getResearchfieldnameE();
		}
	}

	public int getResearchfieldId() {
		return this.researchfieldId;
	}

	public String getResearchFieldName() {
		return this.researchFieldName;
	}

}
