package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.ProjectDao;
import org.labsystem.entity.Project;
import org.springframework.stereotype.Repository;

@Repository("ProjectDao")
public class ProjectDaoImpl extends GenericDaoImpl<Project, Integer> implements ProjectDao {

	@Override
	public Project select(Project entity, Integer id) {
		return super.select(entity, id);
	}

	@Override
	public Integer insert(Project entity) {
		return super.insert(entity);
	}

	@Override
	public boolean update(Project entity) {
		return super.update(entity);
	}

	@Override
	public boolean delete(Project entity) {
		return super.delete(entity);
	}

	@Override
	public List<Project> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Project> projects = this.getSession().createQuery("from Project").list();
		return projects;
	}

	@Override
	public Project get(Integer id) {
		return this.getSession().get(Project.class, id);
	}

}
