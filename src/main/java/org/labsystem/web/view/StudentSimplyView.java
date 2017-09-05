package org.labsystem.web.view;

import org.labsystem.entity.Student;

public class StudentSimplyView {
	private Integer studentId;
	private String studentname;
	private String stupic;
	private String edubkgrd;

	public StudentSimplyView(Student student, EducationBackGroundView edubkgrdView, boolean isChinese) {
		this.studentId = student.getStudentId();
		this.stupic = student.getStupic();
		this.edubkgrd = edubkgrdView.getEdubkgrdName();
		if (isChinese) {
			this.studentname = student.getStudentnameC();
		} else {
			this.studentname = student.getStudentnameE();
		}
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