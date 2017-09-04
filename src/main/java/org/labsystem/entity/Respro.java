package org.labsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "respro")
public class Respro implements java.io.Serializable {

	private static final long serialVersionUID = 493249209940684446L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "respro_id")
	private Integer resproId;
	@Column(name = "research_id")
	private Integer researchId;
	@Column(name = "pro_id")
	private Integer proId;
	@Column(name = "resprointro_c")
	private String resprointroC;
	@Column(name = "resprointro_e")
	private String resprointroE;

	public Respro() {
	}

	public Respro(Integer researchId, Integer proId, String resprointroC, String resprointroE) {
		this.researchId = researchId;
		this.proId = proId;
		this.resprointroC = resprointroC;
		this.resprointroE = resprointroE;
	}

	public Integer getResproId() {
		return this.resproId;
	}

	public void setResproId(Integer resproId) {
		this.resproId = resproId;
	}

	public Integer getResearchId() {
		return this.researchId;
	}

	public void setResearchId(Integer researchId) {
		this.researchId = researchId;
	}

	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getResprointroC() {
		return this.resprointroC;
	}

	public void setResprointroC(String resprointroC) {
		this.resprointroC = resprointroC;
	}

	public String getResprointroE() {
		return this.resprointroE;
	}

	public void setResprointroE(String resprointroE) {
		this.resprointroE = resprointroE;
	}

}
