package org.labsystem.domain.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.labsystem.domain.dao.iface.PaperDao;
import org.labsystem.domain.dao.iface.RespaperDao;
import org.labsystem.domain.view.PaperSimpleView;
import org.labsystem.entity.Research;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<PaperSimpleView> getPaperSimpleByResearch(Research research, boolean isChinese) {
		String sql_str = "from Respaper respaper where respaper.researchId = " + research.getResearchId();
		List<Respaper> respapers = this.getSession().createQuery(sql_str).list();
		List<PaperSimpleView> paperSimpleViews = new ArrayList<>();
		for(Respaper respaper: respapers) {
			PaperSimpleView tmpView = new PaperSimpleView(paperDao.getPaper(respaper.getPaperId()), isChinese);
			paperSimpleViews.add(tmpView);
		}
		return paperSimpleViews;
	}

}
