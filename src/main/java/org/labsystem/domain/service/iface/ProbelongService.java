package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.Probelong;
import org.labsystem.entity.Project;
import org.labsystem.entity.Student;
import org.labsystem.entity.Teacher;

public interface ProbelongService {
	List<Probelong> getAllProbelongs();

	Probelong getProbelong(int id);

	boolean addProbelong(Probelong entity);

	boolean modifyProbelong(Probelong entity);

	boolean deleteProbelong(Probelong entity);

	List<Probelong> getProbelongListByTeacher(Teacher teacher);

	List<Probelong> getProbelongListByStudent(Student student);

	List<Teacher> getTeachersByProject(Project project);

	List<Student> getStudentsByProject(Project project);
}
