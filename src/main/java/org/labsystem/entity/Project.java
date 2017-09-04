package org.labsystem.entity;
// Generated 2017-9-4 11:56:04 by Hibernate Tools 5.2.5.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project implements java.io.Serializable {

	private static final long serialVersionUID = 1765680821021073897L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pro_id")
	private int proId;
	@Column(name = "proname_c")
	private String pronameC;
	@Column(name = "proname_e")
	private String pronameE;
	@Column(name = "prostate")
	private int prostate;
	@Column(name = "prointro_c")
	private String prointroC;
	@Column(name = "prointro_e")
	private String prointroE;
	@Column(name = "prosource_c")
	private String prosourceC;
	@Column(name = "prosource_e")
	private String prosourceE;
	@Column(name = "prostarttime")
	private Date prostarttime;
	@Column(name = "proendtime")
	private Date proendtime;
	@Column(name = "profund")
	private Integer profund;

	public Project() {
	}

	public Project(String pronameC, String pronameE, int prostate, String prointroC, String prointroE,
			String prosourceC, String prosourceE, Date prostarttime, Date proendtime, Integer profund) {
		this.pronameC = pronameC;
		this.pronameE = pronameE;
		this.prostate = prostate;
		this.prointroC = prointroC;
		this.prointroE = prointroE;
		this.prosourceC = prosourceC;
		this.prosourceE = prosourceE;
		this.prostarttime = prostarttime;
		this.proendtime = proendtime;
		this.profund = profund;
	}

	public int getProId() {
		return this.proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getPronameC() {
		return this.pronameC;
	}

	public void setPronameC(String pronameC) {
		this.pronameC = pronameC;
	}

	public String getPronameE() {
		return this.pronameE;
	}

	public void setPronameE(String pronameE) {
		this.pronameE = pronameE;
	}

	public int getProstateC() {
		return this.prostate;
	}

	public void setProstateC(int prostate) {
		this.prostate = prostate;
	}

	public String getProintroC() {
		return this.prointroC;
	}

	public void setProintroC(String prointroC) {
		this.prointroC = prointroC;
	}

	public String getProintroE() {
		return this.prointroE;
	}

	public void setProintroE(String prointroE) {
		this.prointroE = prointroE;
	}

	public String getProsourceC() {
		return this.prosourceC;
	}

	public void setProsourceC(String prosourceC) {
		this.prosourceC = prosourceC;
	}

	public String getProsourceE() {
		return this.prosourceE;
	}

	public void setProsourceE(String prosourceE) {
		this.prosourceE = prosourceE;
	}

	public Date getProstarttime() {
		return this.prostarttime;
	}

	public void setProstarttime(Date prostarttime) {
		this.prostarttime = prostarttime;
	}

	public Date getProendtime() {
		return this.proendtime;
	}

	public void setProendtime(Date proendtime) {
		this.proendtime = proendtime;
	}

	public Integer getProfund() {
		return this.profund;
	}

	public void setProfund(Integer profund) {
		this.profund = profund;
	}

}
