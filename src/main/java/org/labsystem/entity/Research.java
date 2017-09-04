package org.labsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "research")
public class Research implements java.io.Serializable {

	private static final long serialVersionUID = -8123521185724826577L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "research_id")
	private Integer researchId;
	@Column(name = "researchintropic")
	private String researchintropic;
	@Column(name = "researchname_c")
	private String researchnameC;
	@Column(name = "researchname_e")
	private String researchnameE;
	@Column(name = "researchintro_c")
	private String researchintroC;
	@Column(name = "researchintro_e")
	private String researchintroE;

	public Research() {
	}

	public Research(String researchintropic, String researchnameC, String researchnameE, String researchintroC, String researchintroE) {
		this.researchintropic = researchintropic;
		this.researchnameC = researchnameC;
		this.researchnameE = researchnameE;
		this.researchintroC = researchintroC;
		this.researchintroE = researchintroE;
	}

	public Integer getResearchId() {
		return this.researchId;
	}

	public void setResearchId(Integer researchId) {
		this.researchId = researchId;
	}

	public String getResearchnameC() {
		return this.researchnameC;
	}

	public void setResearchnameC(String researchnameC) {
		this.researchnameC = researchnameC;
	}

	public String getResearchnameE() {
		return this.researchnameE;
	}

	public void setResearchnameE(String researchnameE) {
		this.researchnameE = researchnameE;
	}

	public String getResearchintroC() {
		return this.researchintroC;
	}

	public void setResearchintroC(String researchintroC) {
		this.researchintroC = researchintroC;
	}

	public String getResearchintroE() {
		return this.researchintroE;
	}

	public void setResearchintroE(String researchintroE) {
		this.researchintroE = researchintroE;
	}

}
