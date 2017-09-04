package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student getStudent(int id);

	boolean addStudent(Student entity);

	boolean modifyStudent(Student entity);

	boolean deleteStudent(Student entity);
}
