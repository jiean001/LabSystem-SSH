package org.labsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edubkgrd")
public class Edubkgrd implements java.io.Serializable {

	private static final long serialVersionUID = 5378661935810690943L;
	@Id
	@Column(name = "edubkgrd_id")
	private int edubkgrdId;
	@Column(name = "edubkgrdname_c")
	private String edubkgrdnameC;
	@Column(name = "edubkgrdname_e")
	private String edubkgrdnameE;

	public Edubkgrd() {
	}

	public Edubkgrd(int edubkgrdId, String edubkgrdnameC, String edubkgrdnameE) {
		this.edubkgrdId = edubkgrdId;
		this.edubkgrdnameC = edubkgrdnameC;
		this.edubkgrdnameE = edubkgrdnameE;
	}

	public int getEdubkgrdId() {
		return this.edubkgrdId;
	}

	/*
	 * public void setEdubkgrdId(int edubkgrdId) { this.edubkgrdId = edubkgrdId; }
	 */

	public String getEdubkgrdnameC() {
		return this.edubkgrdnameC;
	}

	/*
	 * public void setEdubkgrdnameC(String edubkgrdnameC) { this.edubkgrdnameC =
	 * edubkgrdnameC; }
	 */

	public String getEdubkgrdnameE() {
		return this.edubkgrdnameE;
	}

	/*
	 * public void setEdubkgrdnameE(String edubkgrdnameE) { this.edubkgrdnameE =
	 * edubkgrdnameE; }
	 */

}
