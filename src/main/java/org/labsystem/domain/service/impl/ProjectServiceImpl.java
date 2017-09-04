package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.ProjectDao;
import org.labsystem.domain.service.iface.ProjectService;
import org.labsystem.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ProjectService")
@Transactional
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectDao projectDao;

	@Override
	public List<Project> getAllProjects() {
		return projectDao.findAll();
	}

	@Override
	public Project getProject(int projectId) {
		return projectDao.get(projectId);
	}

	@Override
	public boolean addProject(Project project) {
		return projectDao.insert(project) > 0;
	}

	@Override
	public boolean modifyProject(Project project) {
		return projectDao.update(project);
	}

	@Override
	public boolean deleteProject(Project project) {
		return projectDao.delete(project);
	}

}
