package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.ProbelongDao;
import org.labsystem.domain.service.iface.ProbelongService;
import org.labsystem.entity.Probelong;
import org.labsystem.entity.Project;
import org.labsystem.entity.Student;
import org.labsystem.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ProbelongService")
@Transactional
public class ProbelongServiceImpl implements ProbelongService {
	@Autowired
	private ProbelongDao probelongDao;

	@Override
	public List<Probelong> getAllProbelongs() {
		return probelongDao.findAll();
	}

	@Override
	public Probelong getProbelong(int id) {
		return probelongDao.get(id);
	}

	@Override
	public boolean addProbelong(Probelong entity) {
		return probelongDao.insert(entity) > 0;
	}

	@Override
	public boolean modifyProbelong(Probelong entity) {
		return probelongDao.update(entity);
	}

	@Override
	public boolean deleteProbelong(Probelong entity) {
		return probelongDao.delete(entity);
	}

	@Override
	public List<Probelong> getProbelongListByTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Probelong> getProbelongListByStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getTeachersByProject(Project project) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentsByProject(Project project) {
		// TODO Auto-generated method stub
		return null;
	}

}
