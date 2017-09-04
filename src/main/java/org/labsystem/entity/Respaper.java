package org.labsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "respaper")
public class Respaper implements java.io.Serializable {

	private static final long serialVersionUID = -3524734497319933756L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "respaper_id")
	private Integer respaperId;
	@Column(name = "research_id")
	private Integer researchId;
	@Column(name = "paper_id")
	private Integer paperId;
	@Column(name = "respaperintro_c")
	private String respaperintroC;
	@Column(name = "respaperintro_e")
	private String respaperintroE;

	public Respaper() {
	}

	public Respaper(Integer researchId, Integer paperId, String respaperintroC, String respaperintroE) {
		this.researchId = researchId;
		this.paperId = paperId;
		this.respaperintroC = respaperintroC;
		this.respaperintroE = respaperintroE;
	}

	public Integer getRespaperId() {
		return this.respaperId;
	}

	public void setRespaperId(Integer respaperId) {
		this.respaperId = respaperId;
	}

	public Integer getResearchId() {
		return this.researchId;
	}

	public void setResearchId(Integer researchId) {
		this.researchId = researchId;
	}

	public Integer getPaperId() {
		return this.paperId;
	}

	public void setPaperId(Integer paperId) {
		this.paperId = paperId;
	}

	public String getRespaperintroC() {
		return this.respaperintroC;
	}

	public void setRespaperintroC(String respaperintroC) {
		this.respaperintroC = respaperintroC;
	}

	public String getRespaperintroE() {
		return this.respaperintroE;
	}

	public void setRespaperintroE(String respaperintroE) {
		this.respaperintroE = respaperintroE;
	}

}
