package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.ResbelongDao;
import org.labsystem.domain.service.iface.ResbelongService;
import org.labsystem.entity.Resbelong;
import org.labsystem.entity.Research;
import org.labsystem.entity.Student;
import org.labsystem.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ResbelongService")
@Transactional
public class ResbelongServiceImpl implements ResbelongService {
	@Autowired
	private ResbelongDao resbelongDao;

	@Override
	public List<Resbelong> getResbelongs() {
		return resbelongDao.findAll();
	}

	@Override
	public Resbelong getResbelong(int id) {
		return resbelongDao.get(id);
	}

	@Override
	public boolean addResbelong(Resbelong entity) {
		return resbelongDao.insert(entity) > 0;
	}

	@Override
	public boolean modifyResbelong(Resbelong entity) {
		return resbelongDao.update(entity);
	}

	@Override
	public boolean deleteResbelong(Resbelong entity) {
		return resbelongDao.delete(entity);
	}

	@Override
	public List<Resbelong> getResbelongListByTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Resbelong> getResbelongListByStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeachersByResearch(Research research) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentsByReaearch(Research research) {
		// TODO Auto-generated method stub
		return null;
	}

}
