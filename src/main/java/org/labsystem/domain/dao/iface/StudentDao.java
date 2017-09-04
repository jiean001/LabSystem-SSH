package org.labsystem.domain.dao.iface;

import org.labsystem.entity.Student;

public interface StudentDao extends GenericDao<Student, Integer> {
	Student get(int id);
}
