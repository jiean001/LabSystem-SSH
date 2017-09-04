package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.PaperbelongDao;
import org.labsystem.domain.service.iface.PaperbelongService;
import org.labsystem.entity.Paper;
import org.labsystem.entity.Paperbelong;
import org.labsystem.entity.Student;
import org.labsystem.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("PaperbelongService")
@Transactional
public class PaperbelongServiceimpl implements PaperbelongService {
	@Autowired
	private PaperbelongDao paperbelongDao;

	@Override
	public List<Paperbelong> getPaperbelongs() {
		return paperbelongDao.findAll();
	}

	@Override
	public Paperbelong getPaperbelong(int id) {
		return paperbelongDao.get(id);
	}

	@Override
	public boolean addPaperbelong(Paperbelong entity) {
		return paperbelongDao.insert(entity) > 0;
	}

	@Override
	public boolean modifyPaperbelong(Paperbelong entity) {
		return paperbelongDao.update(entity);
	}

	@Override
	public boolean deletePaperbelong(Paperbelong entity) {
		return paperbelongDao.delete(entity);
	}

	@Override
	public List<Paperbelong> getPaperbelongListByTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Paperbelong> getPaperbelongListByStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeachersByPaper(Paper paper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentsByPaper(Paper paper) {
		// TODO Auto-generated method stub
		return null;
	}

}
