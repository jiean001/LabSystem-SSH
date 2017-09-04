package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.StudentDao;
import org.labsystem.domain.service.iface.StudentService;
import org.labsystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("StudentService")
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> getAllResearch() {
		return studentDao.findAll();
	}

	@Override
	public Student getResearch(int id) {
		return studentDao.get(id);
	}

	@Override
	public boolean addResearch(Student entity) {
		return studentDao.insert(entity) > 0;
	}

	@Override
	public boolean modifyResearch(Student entity) {
		return studentDao.update(entity);
	}

	@Override
	public boolean deleteResearch(Student entity) {
		return studentDao.delete(entity);
	}

}
