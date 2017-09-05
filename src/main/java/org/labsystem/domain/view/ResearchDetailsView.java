package org.labsystem.domain.view;

import java.util.List;

import org.labsystem.domain.dao.iface.RespaperDao;
import org.labsystem.entity.Research;
import org.springframework.beans.factory.annotation.Autowired;

public class ResearchDetailsView {
	@Autowired
	private RespaperDao respaperDao;

	private Integer researchId;
	private String researchIntroPic;
	private String researcName;
	private String researchIntro;
	private List<PaperSimpleView> paperViews;

	public ResearchDetailsView(Research research, boolean isChinese) {
		this.researchId = research.getResearchId();
		this.researchIntroPic = research.getResearchintropic();
		if(isChinese) {
			this.researcName = research.getResearchnameC();
			this.researchIntro = research.getResearchintroC();
		} else {
			this.researcName = research.getResearchnameE();
			this.researchIntro = research.getResearchintroE();
		}
		this.paperViews = respaperDao.getPaperSimpleByResearch(research, isChinese);
	}

	public int getResearchId() {
		return this.researchId;
	}

	public String getResearchIntroPic() {
		return this.researchIntroPic;
	}

	public String getresearcName() {
		return this.researcName;
	}

	public String getResearchIntro() {
		return this.researchIntro;
	}

	public  List<PaperSimpleView> getPaperViews() {
		return this.paperViews;
	}

}
