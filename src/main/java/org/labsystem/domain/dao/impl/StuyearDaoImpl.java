package org.labsystem.domain.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.labsystem.domain.dao.iface.StuyearDao;
import org.labsystem.domain.entity.Stuyear;
import org.springframework.stereotype.Repository;

@Repository("StuyearDao")
public class StuyearDaoImpl extends GenericDaoImpl<Stuyear, Integer> implements StuyearDao {
	@Override
	public List<Stuyear> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Stuyear> stuyears = this.getSession().createQuery("from Stuyear").list();
		return stuyears;
	}

	@Override
	public Stuyear get(int id) {
		return this.getSession().get(Stuyear.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getAllYears() {
		String sql = "select  distinct  year from stuyear syear ORDER BY syear.year desc";
		SQLQuery query = this.getSession().createSQLQuery(sql);
		@SuppressWarnings("rawtypes")
		List list = query.list();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Stuyear> getAllStuyear(String year) {
		String hql = "from Stuyear stuyear where stuyear.year = " + year;
		return this.getSession().createQuery(hql).list();
	}

}
