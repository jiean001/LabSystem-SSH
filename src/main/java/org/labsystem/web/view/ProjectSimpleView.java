package org.labsystem.web.view;

import org.labsystem.domain.entity.Project;
import org.labsystem.util.Feature;

public class ProjectSimpleView {
	private int proId;
	private String proName;
	private String proState;
	private String proIntro;
	private String proSource;
	private String proStartTime;
	private String proEndTime;
	private Integer profund;

	//用来展示的信息
	private String showMsg;

	public ProjectSimpleView(Project project, StateView stateView, boolean isChinese) {
		this.proId = project.getProId();
		this.proState = stateView.getStateName();
		this.proStartTime = Feature.date2String(project.getProstarttime());
		this.proEndTime = Feature.date2String(project.getProendtime());
		this.profund = project.getProfund();
		if(isChinese) {
			this.proName = project.getPronameC();
			this.proIntro = project.getProintroC();
			this.proSource = project.getProsourceC();
		} else {
			this.proName = project.getPronameE();
			this.proIntro = project.getProintroE();
			this.proSource = project.getProsourceE();
		}

		this.showMsg = this.proSource + "," +  this.proName + "," + this.proIntro +
				this.proStartTime + "-" + this.proEndTime + "," + this.proState + "," + this.profund + ".";

	}

	public int getProId() {
		return proId;
	}

	public String getProName() {
		return proName;
	}

	public String getProState() {
		return proState;
	}

	public String getProIntro() {
		return proIntro;
	}

	public String getProSource() {
		return proSource;
	}

	public String getProStartTime() {
		return proStartTime;
	}

	public String getProEndTime() {
		return proEndTime;
	}

	public Integer getProfund() {
		return profund;
	}

	public String getShowMsg() {
		return showMsg;
	}
}
