package org.labsystem.domain.dao.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.NewsDao;
import org.labsystem.domain.entity.News;
import org.springframework.stereotype.Repository;

@Repository("NewsDao")
public class NewsDaoImpl extends GenericDaoImpl<News, Integer> implements NewsDao {

	@Override
	public News select(News entity, Integer id) {
		return super.select(entity, id);
	}

	@Override
	public Integer insert(News entity) {
		return super.insert(entity);
	}

	@Override
	public boolean update(News entity) {
		return super.update(entity);
	}

	@Override
	public boolean delete(News entity) {
		return super.delete(entity);
	}

	@Override
	public List<News> findAll() {
		// TODO cache
		@SuppressWarnings("unchecked")
		List<News> newlist = this.getSession().createQuery("from News news ORDER BY news.newstime desc").list();
		return newlist;
	}

	@Override
	public News get(Integer id) {
		return this.getSession().get(News.class, id);
	}

}
