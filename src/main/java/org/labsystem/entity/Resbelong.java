package org.labsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resbelong")
public class Resbelong implements java.io.Serializable {

	private static final long serialVersionUID = -7230796714908702071L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "resbelong_id")
	private Integer resbelongId;
	@Column(name = "research_id")
	private int researchId;
	@Column(name = "resbelongisstu")
	private boolean resbelongisstu;
	@Column(name = "person_id")
	private Integer personId;
	@Column(name = "resbelongbriefintro_c")
	private String resbelongbriefintroC;
	@Column(name = "resbelongbriefintro_e")
	private String resbelongbriefintroE;

	public Resbelong() {
	}

	public Resbelong(int researchId, boolean resbelongisstu) {
		this.researchId = researchId;
		this.resbelongisstu = resbelongisstu;
	}

	public Resbelong(int researchId, boolean resbelongisstu, Integer personId, String resbelongbriefintroC,
			String resbelongbriefintroE) {
		this.researchId = researchId;
		this.resbelongisstu = resbelongisstu;
		this.personId = personId;
		this.resbelongbriefintroC = resbelongbriefintroC;
		this.resbelongbriefintroE = resbelongbriefintroE;
	}

	public Integer getResbelongId() {
		return this.resbelongId;
	}

	public void setResbelongId(Integer resbelongId) {
		this.resbelongId = resbelongId;
	}

	public int getResearchId() {
		return this.researchId;
	}

	public void setResearchId(int researchId) {
		this.researchId = researchId;
	}

	public boolean isResbelongisstu() {
		return this.resbelongisstu;
	}

	public void setResbelongisstu(boolean resbelongisstu) {
		this.resbelongisstu = resbelongisstu;
	}

	public Integer getPersonId() {
		return this.personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getResbelongbriefintroC() {
		return this.resbelongbriefintroC;
	}

	public void setResbelongbriefintroC(String resbelongbriefintroC) {
		this.resbelongbriefintroC = resbelongbriefintroC;
	}

	public String getResbelongbriefintroE() {
		return this.resbelongbriefintroE;
	}

	public void setResbelongbriefintroE(String resbelongbriefintroE) {
		this.resbelongbriefintroE = resbelongbriefintroE;
	}

}
