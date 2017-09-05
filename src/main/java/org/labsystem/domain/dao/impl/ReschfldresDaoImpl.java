package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.ReschfldresDao;
import org.labsystem.domain.entity.Reschfldres;
import org.labsystem.domain.entity.Researchfield;
import org.springframework.stereotype.Repository;

@Repository("ReschfldresDao")
public class ReschfldresDaoImpl extends GenericDaoImpl<Reschfldres, Integer> implements ReschfldresDao {
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Reschfldres> getReschfldresByReschfld(Researchfield entity) {
		String sql_str = "from Reschfldres reschfldres where reschfldres.researchfieldId = "
				+ entity.getResearchfieldId();
		List<Reschfldres> reschfldres = this.getSession().createQuery(sql_str).list();
		return reschfldres;
	}
}
