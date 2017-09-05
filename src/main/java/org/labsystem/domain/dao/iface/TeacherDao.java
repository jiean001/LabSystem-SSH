package org.labsystem.domain.dao.iface;

import org.labsystem.domain.entity.Teacher;

public interface TeacherDao extends GenericDao<Teacher, Integer> {
	Teacher get(int id);
}
