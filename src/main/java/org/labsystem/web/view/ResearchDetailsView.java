package org.labsystem.web.view;

import java.util.List;

import org.labsystem.domain.entity.Research;

//研究方向的视图
//介绍图片,名称,介绍,论文列表
public class ResearchDetailsView {
	private Integer researchId;
	private String researchIntroPic;
	private String researchName;
	private String researchIntro;
	private List<PaperSimpleView> researchPapers;

	public ResearchDetailsView(Research research, List<PaperSimpleView> researchPapers, boolean isChinese) {
		this.researchId = research.getResearchId();
		this.researchIntroPic = research.getResearchintropic();
		this.researchPapers = researchPapers;
		if (isChinese) {
			this.researchName = research.getResearchnameC();
			this.researchIntro = research.getResearchintroC();
		} else {
			this.researchName = research.getResearchnameE();
			this.researchIntro = research.getResearchintroE();
		}
	}

	public Integer getResearchId() {
		return researchId;
	}

	public String getResearchIntroPic() {
		return researchIntroPic;
	}

	public String getResearchName() {
		return researchName;
	}

	public String getResearchIntro() {
		return researchIntro;
	}

	public List<PaperSimpleView> getResearchPapers() {
		return researchPapers;
	}
}
