package org.labsystem.web.view;

import org.labsystem.domain.entity.Teacher;

public class TeacherSimpleView {
	private Integer teacherId;
	private String teacherName;
	private String profsnTitle;

	public TeacherSimpleView(Teacher teacher, ProfessionalTitleView pv, boolean isChinese) {
		this.teacherId = teacher.getTeacherId();
		this.profsnTitle = pv.getProfsnTitleName();
		if (isChinese) {
			this.teacherName = teacher.getTeachernameC();
		} else {
			this.teacherName = teacher.getTeachernameE();
		}
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public String getProfsnTitle() {
		return profsnTitle;
	}
}
