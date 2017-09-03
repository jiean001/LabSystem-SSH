package org.labsystem.entity;
// Generated 2017-9-1 22:05:42 by Hibernate Tools 5.2.5.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // hibernate模型 对应数据库中paper
@Table(name = "paper") // 指定数据库中的表
public class Paper implements java.io.Serializable {

	private static final long serialVersionUID = 7199868885947084061L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paper_id")
	private Integer paperId;
	@Column(name = "papername_C")
	private String papernameC;
	@Column(name = "papername_E")
	private String papernameE;
	@Column(name = "paperbriefintro_c")
	private String paperbriefintroC;
	@Column(name = "paperbriefintro_E")
	private String paperbriefintroE;
	@Column(name = "paperLink")
	private String paperLink;
	@Column(name = "papertype")
	private Integer papertype;
	@Column(name = "papersource_Id")
	private Integer papersourceId;
	@Column(name = "papertime")
	private Date papertime;

	public Paper() {
	}

	public Paper(String papernameC, String papernameE, String paperbriefintroC, String paperbriefintroE,
			String paperLink, Integer papertype, Integer papersourceId, Date papertime) {
		this.papernameC = papernameC;
		this.papernameE = papernameE;
		this.paperbriefintroC = paperbriefintroC;
		this.paperbriefintroE = paperbriefintroE;
		this.paperLink = paperLink;
		this.papertype = papertype;
		this.papersourceId = papersourceId;
		this.papertime = papertime;
	}

	public Integer getPaperId() {
		return this.paperId;
	}

	public void setPaperId(Integer paperId) {
		this.paperId = paperId;
	}

	public String getPapernameC() {
		return this.papernameC;
	}

	public void setPapernameC(String papernameC) {
		this.papernameC = papernameC;
	}

	public String getPapernameE() {
		return this.papernameE;
	}

	public void setPapernameE(String papernameE) {
		this.papernameE = papernameE;
	}

	public String getPaperbriefintroC() {
		return this.paperbriefintroC;
	}

	public void setPaperbriefintroC(String paperbriefintroC) {
		this.paperbriefintroC = paperbriefintroC;
	}

	public String getPaperbriefintroE() {
		return this.paperbriefintroE;
	}

	public void setPaperbriefintroE(String paperbriefintroE) {
		this.paperbriefintroE = paperbriefintroE;
	}

	public String getPaperLink() {
		return this.paperLink;
	}

	public void setPaperLink(String paperLink) {
		this.paperLink = paperLink;
	}

	public Integer getPapertype() {
		return this.papertype;
	}

	public void setPapertype(Integer papertype) {
		this.papertype = papertype;
	}

	public Integer getPapersourceId() {
		return this.papersourceId;
	}

	public void setPapersourceId(Integer papersourceId) {
		this.papersourceId = papersourceId;
	}

	public Date getPapertime() {
		return this.papertime;
	}

	public void setPapertime(Date papertime) {
		this.papertime = papertime;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("paperId:").append(this.paperId);
		str.append(", papernameC:").append(this.papernameC);
		str.append(", papernameE:").append(this.papernameE);
		str.append(", paperbriefintroC:").append(this.paperbriefintroC);
		str.append(", paperbriefintroE:").append(this.paperbriefintroE);
		str.append(", paperLink:").append(this.paperLink);
		str.append(", papertype:").append(this.papertype);
		str.append(", papersourceId:").append(this.papersourceId);
		str.append(", papertime:").append(this.papertime);
		return str.toString();
	}

}
