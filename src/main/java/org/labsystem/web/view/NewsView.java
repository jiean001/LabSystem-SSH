package org.labsystem.web.view;

import java.util.Date;

import org.labsystem.domain.entity.News;

//新闻视图
//id，标题，内容，时间
public class NewsView {
	private Integer newsId;
	private String newsTitle;
	private String newsContent;
	private Date newsTime;

	public NewsView(News news, boolean isChinese) {
		this.newsId = news.getNewsId();
		this.newsTime = news.getNewstime();
		if (isChinese) {
			this.newsTitle = news.getNewstitleC();
			this.newsContent = news.getNewscontentC();
		} else {
			this.newsTitle = news.getNewstitleE();
			this.newsContent = news.getNewscontentE();
		}
	}

	public Integer getNewsId() {
		return newsId;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public String getNewsContent() {
		return newsContent;
	}

	public Date getNewsTime() {
		return newsTime;
	}
}
