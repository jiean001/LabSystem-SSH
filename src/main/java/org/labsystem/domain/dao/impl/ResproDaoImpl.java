package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.ResproDao;
import org.labsystem.entity.Respro;
import org.springframework.stereotype.Repository;

@Repository("ResproDao")
public class ResproDaoImpl extends GenericDaoImpl<Respro, Integer> implements ResproDao {
	@Override
	public List<Respro> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Respro> respros = this.getSession().createQuery("from Respro").list();
		return respros;
	}

	@Override
	public Respro getRespro(int id) {
		return this.getSession().get(Respro.class, id);
	}

}
