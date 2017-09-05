package org.labsystem.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "state")
public class State implements java.io.Serializable {

	private static final long serialVersionUID = 1836349631812037660L;
	@Id
	@Column(name = "state_id")
	private Integer stateId;
	@Column(name = "statename_c")
	private String statenameC;
	@Column(name = "statename_e")
	private String statenameE;

	public State() {
	}

	public State(String statenameC, String statenameE) {
		this.statenameC = statenameC;
		this.statenameE = statenameE;
	}

	public Integer getStateId() {
		return this.stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getStatenameC() {
		return this.statenameC;
	}

	public void setStatenameC(String statenameC) {
		this.statenameC = statenameC;
	}

	public String getStatenameE() {
		return this.statenameE;
	}

	public void setStatenameE(String statenameE) {
		this.statenameE = statenameE;
	}

}
