package org.labsystem.domain.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.labsystem.domain.dao.iface.ResearchfieldDao;
import org.labsystem.domain.view.ResearchfieldView;
import org.labsystem.entity.Researchfield;
import org.springframework.stereotype.Repository;

@Repository("ResearchfieldDao")
public class ResearchfieldDaoImpl extends GenericDaoImpl<Researchfield, Integer> implements ResearchfieldDao {
	@Override
	public Researchfield getResearchfield(int id) {
		return this.getSession().get(Researchfield.class, id);
	}

	@Override
	public List<ResearchfieldView> getAllResearchfields(boolean isChinese) {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Researchfield> researchfields = this.getSession().createQuery("from Researchfield").list();
		List<ResearchfieldView> researchfieldViews = new ArrayList<>();
		for (Researchfield researchfield: researchfields){
			ResearchfieldView tmpView = new ResearchfieldView(researchfield, isChinese);
			researchfieldViews.add(tmpView);
		}
		return researchfieldViews;
	}
}
