package org.labsystem.entity;
// Generated 2017-9-4 1:16:30 by Hibernate Tools 5.2.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supervisortype")
public class Supervisortype implements java.io.Serializable {

	private static final long serialVersionUID = 6318760788345291078L;
	@Id
	@Column(name = "supervisortype_id")
	private int supervisortypeId;
	@Column(name = "supervisortypename_c")
	private String supervisortypenameC;
	@Column(name = "supervisortypename_e")
	private String supervisortypenameE;

	public Supervisortype() {
	}

	public Supervisortype(int supervisortypeId, String supervisortypenameC, String supervisortypenameE) {
		this.supervisortypeId = supervisortypeId;
		this.supervisortypenameC = supervisortypenameC;
		this.supervisortypenameE = supervisortypenameE;
	}

	public int getSupervisortypeId() {
		return this.supervisortypeId;
	}

	/*public void setSupervisortypeId(int supervisortypeId) {
		this.supervisortypeId = supervisortypeId;
	}*/

	public String getSupervisortypenameC() {
		return this.supervisortypenameC;
	}

	/*public void setSupervisortypenameC(String supervisortypenameC) {
		this.supervisortypenameC = supervisortypenameC;
	}*/

	public String getSupervisortypenameE() {
		return this.supervisortypenameE;
	}

	/*public void setSupervisortypenameE(String supervisortypenameE) {
		this.supervisortypenameE = supervisortypenameE;
	}*/

}
