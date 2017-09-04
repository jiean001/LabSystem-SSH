package org.labsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "probelong")
public class Probelong implements java.io.Serializable {

	private static final long serialVersionUID = 4157696632553326009L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "probelong_id")
	private Integer probelongId;
	@Column(name = "pro_id")
	private int proId;
	@Column(name = "probelongisstu")
	private boolean probelongisstu;
	@Column(name = "person_id")
	private Integer personId;
	@Column(name = "probelongduty_c")
	private String probelongdutyC;
	@Column(name = "probelongduty_e")
	private String probelongdutyE;
	@Column(name = "probelongintro_c")
	private String probelongintroC;
	@Column(name = "probelongintro_e")
	private String probelongintroE;

	public Probelong() {
	}

	public Probelong(int proId, boolean probelongisstu) {
		this.proId = proId;
		this.probelongisstu = probelongisstu;
	}

	public Probelong(int proId, boolean probelongisstu, Integer personId, String probelongdutyC, String probelongdutyE,
			String probelongintroC, String probelongintroE) {
		this.proId = proId;
		this.probelongisstu = probelongisstu;
		this.personId = personId;
		this.probelongdutyC = probelongdutyC;
		this.probelongdutyE = probelongdutyE;
		this.probelongintroC = probelongintroC;
		this.probelongintroE = probelongintroE;
	}

	public Integer getProbelongId() {
		return this.probelongId;
	}

	public void setProbelongId(Integer probelongId) {
		this.probelongId = probelongId;
	}

	public int getProId() {
		return this.proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public boolean isProbelongisstu() {
		return this.probelongisstu;
	}

	public void setProbelongisstu(boolean probelongisstu) {
		this.probelongisstu = probelongisstu;
	}

	public Integer getPersonId() {
		return this.personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getProbelongdutyC() {
		return this.probelongdutyC;
	}

	public void setProbelongdutyC(String probelongdutyC) {
		this.probelongdutyC = probelongdutyC;
	}

	public String getProbelongdutyE() {
		return this.probelongdutyE;
	}

	public void setProbelongdutyE(String probelongdutyE) {
		this.probelongdutyE = probelongdutyE;
	}

	public String getProbelongintroC() {
		return this.probelongintroC;
	}

	public void setProbelongintroC(String probelongintroC) {
		this.probelongintroC = probelongintroC;
	}

	public String getProbelongintroE() {
		return this.probelongintroE;
	}

	public void setProbelongintroE(String probelongintroE) {
		this.probelongintroE = probelongintroE;
	}

}
