package org.labsystem.domain.view;

import org.labsystem.entity.Paper;

public class PaperSimpleView {
	private Integer paperId;
	private String paperName;
	private String paperLink;

	public PaperSimpleView(Paper paper, boolean isChinese) {
		this.paperId = paper.getPaperId();
		this.paperLink = paper.getPaperLink();
		if(isChinese) {
			this.paperName = paper.getPapernameC();
		} else {
			this.paperName = paper.getPapernameE();
		}
	}

	public int getPaperId() {
		return this.paperId;
	}

	public String getPaperName() {
		return this.paperName;
	}

	public String getPaperLink() {
		return this.paperLink;
	}
}
