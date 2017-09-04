package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.dao.iface.NewsDao;
import org.labsystem.domain.service.iface.NewsService;
import org.labsystem.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("NewsService") // 注解为service层spring管理bean
@Transactional // 注解此类所有方法加入spring事务, 具体设置默认
public class NewsServiceImpl implements NewsService {
	@Autowired
	private NewsDao newsDao;

	@Override
	public List<News> getAllNews() {
		return newsDao.findAll();
	}

	@Override
	public boolean addNews(News news) {
		return newsDao.insert(news) > 0;
	}

	@Override
	public boolean modifyNews(News news) {
		return newsDao.update(news);
	}

	@Override
	public boolean deleteNews(News news) {
		return newsDao.delete(news);
	}

	@Override
	public News getNews(int id) {
		return newsDao.get(id);
	}

}
