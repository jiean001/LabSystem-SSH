package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.PaperbelongDao;
import org.labsystem.entity.Paperbelong;
import org.springframework.stereotype.Repository;

@Repository("PaperbelongDao")
public class PaperbelongDaoimpl extends GenericDaoImpl<Paperbelong, Integer> implements PaperbelongDao {
	@Override
	public List<Paperbelong> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Paperbelong> paperbelongs = this.getSession().createQuery("from Paperbelong").list();
		return paperbelongs;
	}

	@Override
	public Paperbelong get(Integer id) {
		return this.getSession().get(Paperbelong.class, id);
	}

}
