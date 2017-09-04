package org.labsystem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "newsnew")
public class News implements java.io.Serializable {

	private static final long serialVersionUID = 1846434102514204020L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "news_id")
	private Integer newsId;
	@Column(name = "newstitle_c")
	private String newstitleC;
	@Column(name = "newstitle_e")
	private String newstitleE;
	@Column(name = "newscontent_c")
	private String newscontentC;
	@Column(name = "newscontent_e")
	private String newscontentE;
	@Column(name = "newstime")
	private Date newstime;

	public News() {
	}

	public News(String newstitleC, String newstitleE, String newscontentC, String newscontentE, Date newstime) {
		this.newstitleC = newstitleC;
		this.newstitleE = newstitleE;
		this.newscontentC = newscontentC;
		this.newscontentE = newscontentE;
		this.newstime = newstime;
	}

	public Integer getNewsId() {
		return this.newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	public String getNewstitleC() {
		return this.newstitleC;
	}

	public void setNewstitleC(String newstitleC) {
		this.newstitleC = newstitleC;
	}

	public String getNewstitleE() {
		return this.newstitleE;
	}

	public void setNewstitleE(String newstitleE) {
		this.newstitleE = newstitleE;
	}

	public String getNewscontentC() {
		return this.newscontentC;
	}

	public void setNewscontentC(String newscontentC) {
		this.newscontentC = newscontentC;
	}

	public String getNewscontentE() {
		return this.newscontentE;
	}

	public void setNewscontentE(String newscontentE) {
		this.newscontentE = newscontentE;
	}

	public Date getNewstime() {
		return this.newstime;
	}

	public void setNewstime(Date newstime) {
		this.newstime = newstime;
	}
}
