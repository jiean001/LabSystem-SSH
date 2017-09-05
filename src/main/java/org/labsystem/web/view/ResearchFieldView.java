package org.labsystem.web.view;

import org.labsystem.domain.entity.Researchfield;

//左边栏的视图
public class ResearchFieldView {

	private Integer researchFieldId;
	private String researchFieldName;

	// 根据领域获得该视图
	public ResearchFieldView(Researchfield researchfield, boolean isChinese) {
		this.researchFieldId = researchfield.getResearchfieldId();
		if (isChinese) {
			this.researchFieldName = researchfield.getResearchfieldnameC();
		} else {
			this.researchFieldName = researchfield.getResearchfieldnameE();
		}
	}

	// 领域id
	public Integer getResearchFieldId() {
		return researchFieldId;
	}

	// 领域名称
	public String getResearchFieldName() {
		return researchFieldName;
	}
}
