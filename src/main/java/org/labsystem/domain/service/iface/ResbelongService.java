package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.Resbelong;
import org.labsystem.entity.Research;
import org.labsystem.entity.Student;
import org.labsystem.entity.Teacher;

public interface ResbelongService {
	List<Resbelong> getResbelongs();

	Resbelong getResbelong(int id);

	boolean addResbelong(Resbelong entity);

	boolean modifyResbelong(Resbelong entity);

	boolean deleteResbelong(Resbelong entity);

	List<Resbelong> getResbelongListByTeacher(Teacher teacher);

	List<Resbelong> getResbelongListByStudent(Student student);

	List<Teacher> getTeachersByResearch(Research project);

	List<Student> getStudentsByReaearch(Research project);
}
