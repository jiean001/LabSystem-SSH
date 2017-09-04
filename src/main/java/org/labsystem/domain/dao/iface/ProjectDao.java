package org.labsystem.domain.dao.iface;

import org.labsystem.entity.Project;

public interface ProjectDao extends GenericDao<Project, Integer> {
	Project get(Integer id);
}
