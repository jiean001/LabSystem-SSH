package org.labsystem.web.view;

import org.labsystem.domain.entity.State;

public class StateView {
	private Integer stateId;
	private String stateName;

	public StateView(State state, boolean isChinese) {
		this.stateId = state.getStateId();
		if(isChinese) {
			this.stateName = state.getStatenameC();
		} else {
			this.stateName = state.getStatenameE();
		}
	}

	public Integer getStateId() {
		return stateId;
	}

	public String getStateName() {
		return stateName;
	}
}
