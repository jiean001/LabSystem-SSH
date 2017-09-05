package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.PaperDao;
import org.labsystem.entity.Paper;
import org.springframework.stereotype.Repository;

@Repository("PaperDao")
public class PaperDaoImpl extends GenericDaoImpl<Paper, Integer> implements PaperDao {
	@SuppressWarnings("unchecked")
	@Override
	public List<Paper> findAll() {
		// TODO cache
		List<Paper> professionaltitleTbls = this.getSession().createQuery("from Paper").list();
		return professionaltitleTbls;
	}

	@Override
	public Paper getPaper(int id) {
		return this.getSession().get(Paper.class, id);
	}

}
