package org.labsystem.web.user.view;

import org.labsystem.domain.entity.Student;

//学生信息视图
//id 名字 图片 学历
public class StudentSimplyView {
	private Integer studentId;
	private String studentname;
	private String stupic;
	private String edubkgrd;
	private int edubkgrdID;

	public int getEdubkgrdID() {
		return edubkgrdID;
	}

	public void setEdubkgrdID(int edubkgrdID) {
		this.edubkgrdID = edubkgrdID;
	}

	public StudentSimplyView(Student student, EducationBackGroundView edubkgrdView, boolean isChinese) {
		this.studentId = student.getStudentId();
		this.stupic = student.getStupic();
		this.edubkgrd = edubkgrdView.getEdubkgrdName();
		if (isChinese) {
			this.studentname = student.getStudentnameC();
		} else {
			this.studentname = student.getStudentnameE();
		}
		this.edubkgrdID = student.getEdubkgrdId();
	}

	public Integer getStudentId() {
		return studentId;
	}

	public String getStudentname() {
		return studentname;
	}

	public String getStupic() {
		return stupic;
	}

	public String getEdubkgrd() {
		return edubkgrd;
	}
}
