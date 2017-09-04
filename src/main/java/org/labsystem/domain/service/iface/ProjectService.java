package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.Project;

public interface ProjectService {
	List<Project> getAllProjects();

	// List<Project> getProjectsByState();
	Project getProject(int projectId);

	boolean addProject(Project project);

	boolean modifyProject(Project project);

	boolean deleteProject(Project project);

}
