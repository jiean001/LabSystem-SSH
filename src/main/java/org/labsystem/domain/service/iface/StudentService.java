package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.web.view.StudentSimplyView;

public interface StudentService {
	List<String> getAllYears();

	List<StudentSimplyView> getStudentsByYear(String year, boolean isChinese);
}
