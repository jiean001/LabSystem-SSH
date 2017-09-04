package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.Teacher;

public interface TeacherService {
	List<Teacher> getAllTeachers();

	Teacher getTeacher(int id);

	boolean addTeacher(Teacher entity);

	boolean modifyTeacher(Teacher entity);

	boolean deleteTeacher(Teacher entity);
}
