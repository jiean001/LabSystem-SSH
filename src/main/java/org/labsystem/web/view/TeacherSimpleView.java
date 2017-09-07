package org.labsystem.web.view;

import org.labsystem.domain.entity.Teacher;

//老师简表
//id， 姓名， 学历
public class TeacherSimpleView {
	private Integer teacherId;
	private String teacherPic;
	private String teacherName;
	private String profsnTitle;
	private String teacherEmail;
	private String teacherPhone;
	private String teacherIntro;

	public TeacherSimpleView(Teacher teacher, ProfessionalTitleView pv, boolean isChinese) {
		this.teacherId = teacher.getTeacherId();
		this.profsnTitle = pv.getProfsnTitleName();
		this.teacherEmail = teacher.getTeacheremail();
		this.teacherPhone = teacher.getTeacherphone();
		this.teacherPic = teacher.getTeacherpic();
		if (isChinese) {
			this.teacherName = teacher.getTeachernameC();
			this.teacherIntro = teacher.getTeacherbriefintroC();
		} else {
			this.teacherName = teacher.getTeachernameE();
			this.teacherIntro = teacher.getTeacherbriefintroE();
		}
	}

	public String getTeacherPic() {
		return teacherPic;
	}

	public String getTeacherEmail() {
		return teacherEmail;
	}

	public String getTeacherPhone() {
		return teacherPhone;
	}

	public String getTeacherIntro() {
		return teacherIntro;
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
