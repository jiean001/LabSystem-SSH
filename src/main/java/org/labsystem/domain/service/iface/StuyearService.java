package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.Student;

public interface StuyearService {
	List<Student> getStudentsByyear(String year);
}
