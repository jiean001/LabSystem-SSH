package org.labsystem.web.user.view;

import org.labsystem.domain.entity.Paper;

//论文视图
//论文名称，链接
//注意：这个链接可以是下载好的在服务器的pdf文件也可以是发表到的会议的链接
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
