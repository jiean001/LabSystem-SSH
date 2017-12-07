package org.labsystem.domain.service.user.iface;

import java.util.List;

import org.labsystem.web.user.view.StudentSimplyView;

public interface StudentService {
	List<String> getAllYears();

	List<StudentSimplyView> getStudentsByYear(String year, boolean isChinese);

	List<StudentSimplyView> getInternaltionalStudentsByYear(String year, boolean isChinese);

	List<StudentSimplyView> getMasterStudentsByYear(String year, boolean isChinese);

	List<StudentSimplyView> getPHDStudentsByYear(String year, boolean isChinese);
}
