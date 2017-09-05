package org.labsystem.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "professionaltitle")
public class Professionaltitle implements java.io.Serializable {

	private static final long serialVersionUID = -4792013657043316546L;
	@Id
	@Column(name = "profsntitle_id")
	private int profsntitleId;
	@Column(name = "profsntitlename_c")
	private String profsntitlenameC;
	@Column(name = "profsntitlename_e")
	private String profsntitlenameE;

	public Professionaltitle() {
	}

	public Professionaltitle(int profsntitleId, String profsntitlenameC, String profsntitlenameE) {
		this.profsntitleId = profsntitleId;
		this.profsntitlenameC = profsntitlenameC;
		this.profsntitlenameE = profsntitlenameE;
	}

	public int getProfsntitleId() {
		return this.profsntitleId;
	}

	/*
	 * public void setProfsntitleId(int profsntitleId) { this.profsntitleId =
	 * profsntitleId; }
	 */

	public String getProfsntitlenameC() {
		return this.profsntitlenameC;
	}

	/*
	 * public void setProfsntitlenameC(String profsntitlenameC) {
	 * this.profsntitlenameC = profsntitlenameC; }
	 */

	public String getProfsntitlenameE() {
		return this.profsntitlenameE;
	}

	/*
	 * public void setProfsntitlenameE(String profsntitlenameE) {
	 * this.profsntitlenameE = profsntitlenameE; }
	 */

}
