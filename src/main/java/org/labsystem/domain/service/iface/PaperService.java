package org.labsystem.domain.service.iface;

import java.util.Date;
import java.util.List;

import org.labsystem.entity.Paper;

public interface PaperService {
	//List<Paper> getPaperByTeacher(Teacher teacher);
	//List<Paper> getPaperByStudent(Stu student);
	List<Paper> getPaperByTime(Date starttime, Date endTime);
	//List<Paper> getPaperBySource()
	List<Paper> getAllPaper();

	boolean addPaper(Paper paper);
	boolean updatePaper(Paper paper);
	boolean deletePaper(Paper paper);
}
