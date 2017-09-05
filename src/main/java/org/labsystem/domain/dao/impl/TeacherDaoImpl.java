package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.TeacherDao;
import org.labsystem.domain.entity.Teacher;
import org.springframework.stereotype.Repository;

@Repository("TeacherDao")
public class TeacherDaoImpl extends GenericDaoImpl<Teacher, Integer> implements TeacherDao {
	@Override
	public List<Teacher> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Teacher> teachers = this.getSession().createQuery("from Teacher").list();
		return teachers;
	}

	@Override
	public Teacher get(int id) {
		return this.getSession().get(Teacher.class, id);
	}

}
