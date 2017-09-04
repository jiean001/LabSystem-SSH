package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.Student;

public interface StudentService {
	List<Student> getAllResearch();

	Student getResearch(int id);

	boolean addResearch(Student entity);

	boolean modifyResearch(Student entity);

	boolean deleteResearch(Student entity);
}
