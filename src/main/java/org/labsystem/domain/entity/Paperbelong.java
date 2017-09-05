package org.labsystem.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paperbelong")
public class Paperbelong implements java.io.Serializable {

	private static final long serialVersionUID = -3340736609935043286L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paperbelong_id")
	private Integer paperbelongId;
	@Column(name = "paper_id")
	private int paperId;
	@Column(name = "paperbelongisstu")
	private Boolean paperbelongisstu;
	@Column(name = "person_id")
	private Integer personId;
	@Column(name = "authortype_c")
	private String authortypeC;
	@Column(name = "authortype_e")
	private String authortypeE;
	@Column(name = "paperbelongintro_c")
	private String paperbelongintroC;
	@Column(name = "paperbelonginfo_e")
	private String paperbelonginfoE;

	public Paperbelong() {
	}

	public Paperbelong(int paperId) {
		this.paperId = paperId;
	}

	public Paperbelong(int paperId, Boolean paperbelongisstu, Integer personId, String authortypeC, String authortypeE,
			String paperbelongintroC, String paperbelonginfoE) {
		this.paperId = paperId;
		this.paperbelongisstu = paperbelongisstu;
		this.personId = personId;
		this.authortypeC = authortypeC;
		this.authortypeE = authortypeE;
		this.paperbelongintroC = paperbelongintroC;
		this.paperbelonginfoE = paperbelonginfoE;
	}

	public Integer getPaperbelongId() {
		return this.paperbelongId;
	}

	public void setPaperbelongId(Integer paperbelongId) {
		this.paperbelongId = paperbelongId;
	}

	public int getPaperId() {
		return this.paperId;
	}

	public void setPaperId(int paperId) {
		this.paperId = paperId;
	}

	public Boolean getPaperbelongisstu() {
		return this.paperbelongisstu;
	}

	public void setPaperbelongisstu(Boolean paperbelongisstu) {
		this.paperbelongisstu = paperbelongisstu;
	}

	public Integer getPersonId() {
		return this.personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getAuthortypeC() {
		return this.authortypeC;
	}

	public void setAuthortypeC(String authortypeC) {
		this.authortypeC = authortypeC;
	}

	public String getAuthortypeE() {
		return this.authortypeE;
	}

	public void setAuthortypeE(String authortypeE) {
		this.authortypeE = authortypeE;
	}

	public String getPaperbelongintroC() {
		return this.paperbelongintroC;
	}

	public void setPaperbelongintroC(String paperbelongintroC) {
		this.paperbelongintroC = paperbelongintroC;
	}

	public String getPaperbelonginfoE() {
		return this.paperbelonginfoE;
	}

	public void setPaperbelonginfoE(String paperbelonginfoE) {
		this.paperbelonginfoE = paperbelonginfoE;
	}

}
