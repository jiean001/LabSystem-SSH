package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.TeacherDao;
import org.labsystem.domain.service.iface.TeacherService;
import org.labsystem.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("TeacherService")
@Transactional
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherDao teacherDao;

	@Override
	public List<Teacher> getAllTeachers() {
		return teacherDao.findAll();
	}

	@Override
	public Teacher getTeacher(int id) {
		return teacherDao.get(id);
	}

	@Override
	public boolean addTeacher(Teacher entity) {
		return teacherDao.insert(entity) > 0;
	}

	@Override
	public boolean modifyTeacher(Teacher entity) {
		return teacherDao.update(entity);
	}

	@Override
	public boolean deleteTeacher(Teacher entity) {
		return teacherDao.delete(entity);
	}

}
