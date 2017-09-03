package org.labsystem.dao.impl;

import java.util.List;

import org.labsystem.dao.iface.EdubkgrdDao;
import org.labsystem.entity.Edubkgrd;
import org.springframework.stereotype.Repository;

@Repository("EdubkgrdDao")
public class EdubkgrdDaoImpl extends GenericDaoImpl<Edubkgrd, Integer> implements EdubkgrdDao {

	@Override
	public Edubkgrd select(Edubkgrd entity, Integer id) {
		return super.select(entity, id);
	}

	// 无此方法
	@Override
	public Integer insert(Edubkgrd entity) {
		return null;
	}

	// 无此方法
	@Override
	public boolean update(Edubkgrd entity) {
		// TODO Auto-generated method stub
		return false;
	}

	// 无此方法
	@Override
	public boolean delete(Edubkgrd entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Edubkgrd> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Edubkgrd> edubkgrds = this.getSession().createQuery("from Edubkgrd").list();
		return edubkgrds;
	}

	@Override
	public Edubkgrd get(Integer id) {
		return this.getSession().get(Edubkgrd.class, id);
	}

}
