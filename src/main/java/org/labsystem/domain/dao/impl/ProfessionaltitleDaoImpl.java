package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.ProfessionaltitleDao;
import org.labsystem.entity.Professionaltitle;
import org.springframework.stereotype.Repository;

@Repository("ProfessionaltitleDao")
public class ProfessionaltitleDaoImpl extends GenericDaoImpl<Professionaltitle, Integer>
		implements ProfessionaltitleDao {
	@Override
	public List<Professionaltitle> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Professionaltitle> professionaltitles = this.getSession().createQuery("from Professionaltitle").list();
		return professionaltitles;
	}

	@Override
	public Professionaltitle get(Integer id) {
		return this.getSession().get(Professionaltitle.class, id);
	}

	@Override
	public Professionaltitle select(Professionaltitle entity, Integer id) {
		return super.select(entity, id);
	}

	@Override
	public Integer insert(Professionaltitle entity) {
		return null;
	}

	@Override
	public boolean update(Professionaltitle entity) {
		return false;
	}

	@Override
	public boolean delete(Professionaltitle entity) {
		return false;
	}
}
