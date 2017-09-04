package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.Paper;
import org.labsystem.entity.Paperbelong;
import org.labsystem.entity.Student;
import org.labsystem.entity.Teacher;

public interface PaperbelongService {
	List<Paperbelong> getPaperbelongs();

	Paperbelong getPaperbelong(int id);

	boolean addPaperbelong(Paperbelong entity);

	boolean modifyPaperbelong(Paperbelong entity);

	boolean deletePaperbelong(Paperbelong entity);

	List<Paperbelong> getPaperbelongListByTeacher(Teacher teacher);

	List<Paperbelong> getPaperbelongListByStudent(Student student);

	List<Teacher> getTeachersByPaper(Paper paper);

	List<Student> getStudentsByPaper(Paper paper);

}
