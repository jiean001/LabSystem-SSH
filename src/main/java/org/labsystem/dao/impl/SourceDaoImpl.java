package org.labsystem.dao.impl;

import java.util.List;

import org.labsystem.dao.iface.SourceDao;
import org.labsystem.entity.Source;
import org.springframework.stereotype.Repository;

@Repository("SourceDao")
public class SourceDaoImpl extends GenericDaoImpl<Source, Integer> implements SourceDao {

	@Override
	public Source select(Source entity, Integer id) {
		return super.select(entity, id);
	}

	// 不提供插入功能，直接返回null
	@Override
	public Integer insert(Source entity) {
		return null;
	}

	// 不提供修改功能，直接返回false
	@Override
	public boolean update(Source entity) {
		return false;
	}

	// 不提供删除功能，直接返回false
	@Override
	public boolean delete(Source entity) {
		return false;
	}

	@Override
	public List<Source> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<Source> sources = this.getSession().createQuery("from Source").list();
		return sources;
	}

	@Override
	public Source get(Integer id) {
		return this.getSession().get(Source.class, id);
	}

}
