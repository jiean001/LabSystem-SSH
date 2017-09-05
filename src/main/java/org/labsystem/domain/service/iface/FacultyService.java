package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.web.view.TeacherSimpleView;

public interface FacultyService {
	List<TeacherSimpleView> getAllTeacherSimpeView(boolean isChinese);
}
