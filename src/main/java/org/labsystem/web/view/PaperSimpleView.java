package org.labsystem.web.view;

import org.labsystem.entity.Paper;

public class PaperSimpleView {
	private Integer paperId;
	private String paperName;
	private String paperLink;

	public PaperSimpleView(Paper paper, boolean isChinese) {
		this.paperId = paper.getPaperId();
		this.paperLink = paper.getPaperLink();
		if (isChinese) {
			this.paperName = paper.getPapernameC();
		} else {
			this.paperName = paper.getPapernameE();
		}
	}

	public Integer getPaperId() {
		return paperId;
	}

	public String getPaperName() {
		return paperName;
	}

	public String getPaperLink() {
		return paperLink;
	}
}
