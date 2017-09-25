package org.labsystem.domain.service.user.iface;

import java.util.List;

import org.labsystem.web.user.view.PaperSimpleView;
import org.labsystem.web.user.view.ProjectSimpleView;
import org.labsystem.web.user.view.TeacherSimpleView;

public interface FacultyService {
	List<TeacherSimpleView> getAllTeacherSimpeView(boolean isChinese);

	TeacherSimpleView getTeacherSimpleViewByTeacherID(int teacherID, boolean isChinese);

	List<ProjectSimpleView> getProjectViewsByTeacherID(int teacherID, boolean isChinese);
	
	List<PaperSimpleView> getPaperSimpleViewsByTeacherID(int teacherID, boolean isChinese);
}
