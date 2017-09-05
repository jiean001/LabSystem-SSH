package org.labsystem.domain.dao.iface;

import org.labsystem.domain.entity.Project;

public interface ProjectDao extends GenericDao<Project, Integer> {
	Project get(Integer id);
}
