package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.RespaperDao;
import org.labsystem.entity.Research;
import org.labsystem.entity.Respaper;
import org.springframework.stereotype.Repository;

@Repository("RespaperDao")
public class RespaperDaoImpl extends GenericDaoImpl<Respaper, Integer> implements RespaperDao {
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Respaper> getRespaperByResearch(Research research) {
		String sql_str = "from Respaper respaper where respaper.researchId = " + research.getResearchId();
		return this.getSession().createQuery(sql_str).list();
	}
}
