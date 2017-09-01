package org.labsystem.dao.impl;

import java.util.List;

import org.labsystem.dao.iface.PaperDao;
import org.labsystem.entity.Paper;
import org.springframework.stereotype.Repository;

@Repository("PaperDao")
public class PaperDaoImpl extends GenericDaoImpl<Paper, Integer> implements PaperDao {
	@SuppressWarnings("unchecked")
	@Override
	public List<Paper> findAll() {
		//TODO cache
		System.out.println("getALL--");
		List<Paper> professionaltitleTbls = this.getSession()
				.createQuery("from paper").list();
		System.out.println("getALL-- 11" + (professionaltitleTbls == null));
		return professionaltitleTbls;
	}

	@Override
	public Integer insert(Paper entity) {
		return (Integer) getSession().save(entity);
	}

}
