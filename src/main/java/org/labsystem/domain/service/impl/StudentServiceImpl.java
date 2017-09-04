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
	public List<Student> getAllStudents() {
		return studentDao.findAll();
	}

	@Override
	public Student getStudent(int id) {
		return studentDao.get(id);
	}

	@Override
	public boolean addStudent(Student entity) {
		return studentDao.insert(entity) > 0;
	}

	@Override
	public boolean modifyStudent(Student entity) {
		return studentDao.update(entity);
	}

	@Override
	public boolean deleteStudent(Student entity) {
		return studentDao.delete(entity);
	}

}
