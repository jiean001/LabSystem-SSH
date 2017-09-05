package org.labsystem.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "researchfield")
public class Researchfield implements java.io.Serializable {

	private static final long serialVersionUID = 3366400561307155897L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "researchfield_id")
	private Integer researchfieldId;
	@Column(name = "researchfieldname_c")
	private String researchfieldnameC;
	@Column(name = "researchfieldname_e")
	private String researchfieldnameE;

	public Researchfield() {
	}

	public Researchfield(String researchfieldnameC, String researchfieldnameE) {
		this.researchfieldnameC = researchfieldnameC;
		this.researchfieldnameE = researchfieldnameE;
	}

	public Integer getResearchfieldId() {
		return this.researchfieldId;
	}

	public void setResearchfieldId(Integer researchfieldId) {
		this.researchfieldId = researchfieldId;
	}

	public String getResearchfieldnameC() {
		return this.researchfieldnameC;
	}

	public void setResearchfieldnameC(String researchfieldnameC) {
		this.researchfieldnameC = researchfieldnameC;
	}

	public String getResearchfieldnameE() {
		return this.researchfieldnameE;
	}

	public void setResearchfieldnameE(String researchfieldnameE) {
		this.researchfieldnameE = researchfieldnameE;
	}

}
