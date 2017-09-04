package org.labsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reschfldres")
public class Reschfldres implements java.io.Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 4484940826972114086L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reschfldres_id")
	private Integer reschfldresId;
	@Column(name = "researchfield_id")
	private Integer researchfieldId;
	@Column(name = "research_id")
	private Integer researchId;

	public Reschfldres() {
	}

	public Reschfldres(Integer researchfieldId, Integer researchId) {
		this.researchfieldId = researchfieldId;
		this.researchId = researchId;
	}

	public Integer getReschfldresId() {
		return this.reschfldresId;
	}

	public void setReschfldresId(Integer reschfldresId) {
		this.reschfldresId = reschfldresId;
	}

	public Integer getResearchfieldId() {
		return this.researchfieldId;
	}

	public void setResearchfieldId(Integer researchfieldId) {
		this.researchfieldId = researchfieldId;
	}

	public Integer getResearchId() {
		return this.researchId;
	}

	public void setResearchId(Integer researchId) {
		this.researchId = researchId;
	}

}
