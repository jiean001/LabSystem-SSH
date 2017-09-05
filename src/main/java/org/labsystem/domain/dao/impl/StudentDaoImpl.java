package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.StudentDao;
import org.labsystem.domain.entity.Student;
import org.springframework.stereotype.Repository;

@Repository("StudentDao")
public class StudentDaoImpl extends GenericDaoImpl<Student, Integer> implements StudentDao {
	@Override
	public List<Student> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Student> students = this.getSession().createQuery("from Student").list();
		return students;
	}

	@Override
	public Student get(int id) {
		return this.getSession().get(Student.class, id);
	}

}
