package org.labsystem.web.user.view;

import org.labsystem.domain.entity.Supervisortype;

public class SupervisorTypeView {
	private int supervisorTypeId;
	private String supervisorTypeName;

	public SupervisorTypeView(Supervisortype supervisortype, boolean isChinese) {
		this.supervisorTypeId = supervisortype.getSupervisortypeId();
		if(isChinese) {
			this.supervisorTypeName = supervisortype.getSupervisortypenameC();
		} else {
			this.supervisorTypeName = supervisortype.getSupervisortypenameE();
		}
	}

	public int getSupervisorTypeId() {
		return supervisorTypeId;
	}
	public void setSupervisorTypeId(int supervisorTypeId) {
		this.supervisorTypeId = supervisorTypeId;
	}
	public String getSupervisorTypeName() {
		return supervisorTypeName;
	}
	public void setSupervisorTypeName(String supervisorTypeName) {
		this.supervisorTypeName = supervisorTypeName;
	}
}
