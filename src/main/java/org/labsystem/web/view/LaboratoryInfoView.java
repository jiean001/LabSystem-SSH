package org.labsystem.web.view;

import org.labsystem.domain.entity.LaboratoryInfo;

//实验室信息视图
//需要显示的信息有实验室的名称，标题，介绍，电话，邮箱，地址等
public class LaboratoryInfoView {
	private int laboratoryId;
	private String laboratoryName;
	private String laboratoryTitle;
	private String laboratoryIntro;
	private String laboratoryPhone;
	private String laboratoryEmail;
	private String laboratoryAdd;
	private String laboratoryQQ;
	private String laboratoryWeibo;

	public LaboratoryInfoView(LaboratoryInfo laboratoryInfo, boolean isChinese) {
		this.laboratoryId = laboratoryInfo.getLaboratoryId();
		this.laboratoryPhone = laboratoryInfo.getLaboratoryphone();
		this.laboratoryEmail = laboratoryInfo.getLaboratoryemail();
		this.laboratoryQQ = laboratoryInfo.getLaboratoryqq();
		this.laboratoryWeibo = laboratoryInfo.getLaboratoryweibo();

		if (isChinese) {
			this.laboratoryName = laboratoryInfo.getLaboratorynameC();
			this.laboratoryTitle = laboratoryInfo.getLaboratorytitleC();
			this.laboratoryIntro = laboratoryInfo.getLaboratoryintroC();
			this.laboratoryAdd = laboratoryInfo.getLaboratoryaddC();
		} else {
			this.laboratoryName = laboratoryInfo.getLaboratorynameE();
			this.laboratoryTitle = laboratoryInfo.getLaboratorytitleE();
			this.laboratoryIntro = laboratoryInfo.getLaboratoryintroE();
			this.laboratoryAdd = laboratoryInfo.getLaboratoryaddE();
		}
	}

	public int getLaboratoryId() {
		return laboratoryId;
	}

	public String getLaboratoryName() {
		return laboratoryName;
	}

	public String getLaboratoryTitle() {
		return laboratoryTitle;
	}

	public String getLaboratoryIntro() {
		return laboratoryIntro;
	}

	public String getLaboratoryPhone() {
		return laboratoryPhone;
	}

	public String getLaboratoryEmail() {
		return laboratoryEmail;
	}

	public String getLaboratoryAdd() {
		return laboratoryAdd;
	}

	public String getLaboratoryQQ() {
		return laboratoryQQ;
	}

	public String getLaboratoryWeibo() {
		return laboratoryWeibo;
	}
}
