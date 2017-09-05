package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.PaperDao;
import org.labsystem.domain.dao.iface.RespaperDao;
import org.labsystem.entity.Respaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("RespaperDao")
public class RespaperDaoImpl extends GenericDaoImpl<Respaper, Integer> implements RespaperDao {
	@Autowired
	private PaperDao paperDao;

	@Override
	public List<Respaper> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Respaper> respapers = this.getSession().createQuery("from Respaper").list();
		return respapers;
	}

	@Override
	public Respaper get(Integer id) {
		return this.getSession().get(Respaper.class, id);
	}
}
