package org.labsystem.domain.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.labsystem.domain.dao.iface.ReschfldresDao;
import org.labsystem.domain.dao.iface.ResearchDao;
import org.labsystem.domain.view.ResearchDetailsView;
import org.labsystem.entity.Reschfldres;
import org.labsystem.entity.Research;
import org.labsystem.entity.Researchfield;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("ReschfldresDao")
public class ReschfldresDaoImpl extends GenericDaoImpl<Reschfldres, Integer> implements ReschfldresDao {
	@Autowired
	private ResearchDao researchDao;

	@Override
	public List<Reschfldres> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Reschfldres> reschfldres = this.getSession().createQuery("from Reschfldres").list();
		return reschfldres;
	}

	@Override
	public Reschfldres get(int id) {
		return this.getSession().get(Reschfldres.class, id);
	}

	//通过领域获得子领域
	@SuppressWarnings("unchecked")
	@Override
	public List<Research> getResearchsByReschfld(Researchfield entity) {
		//先获得Reschfldres List
		String sql_str = "from Reschfldres reschfldres where reschfldres.researchfieldId = " + entity.getResearchfieldId();
		List<Reschfldres> reschfldres = this.getSession().createQuery(sql_str).list();
		List<Research> Researchs = new ArrayList<>();
		//遍历Reschfldres List获得Research List
		for(Reschfldres rfr: reschfldres) {
			Research res = researchDao.get(rfr.getResearchId());
			Researchs.add(res);
		}
		return Researchs;
	}

	@Override
	public List<ResearchDetailsView> getResearchDetailsViewByResearchfield(Researchfield entity, boolean isChinese) {
		//获得子领域
		List<Research> Researchs = this.getResearchsByReschfld(entity);
		List<ResearchDetailsView> detailsViews = new ArrayList<>();
		//遍历子领域以便产生领域的详细视图
		for(Research res: Researchs) {
			ResearchDetailsView tmpView = new ResearchDetailsView(res, isChinese);
			detailsViews.add(tmpView);
		}
		return detailsViews;
	}

}
