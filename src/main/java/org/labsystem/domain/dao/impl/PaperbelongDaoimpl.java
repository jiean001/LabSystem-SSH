package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.PaperbelongDao;
import org.labsystem.domain.entity.Paperbelong;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Paperbelong> getPaperbelongs(boolean isStu, int personID) {
		String hql = "from Paperbelong paperbelong where paperbelong.paperbelongisstu =" + isStu + " and paperbelong.personId = "
				+ personID;
		List<Paperbelong> paperbelongs = this.getSession().createQuery(hql).list();
		return paperbelongs;
	}

}
