package org.labsystem.domain.service.user.impl;

import java.util.ArrayList;
import java.util.List;

import org.labsystem.domain.dao.iface.NewsDao;
import org.labsystem.domain.entity.News;
import org.labsystem.domain.service.user.iface.LatestNewsService;
import org.labsystem.web.user.view.NewsView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("LatestNewsService")
@Transactional
public class LatestNewsServiceImpl implements LatestNewsService {
	@Autowired
	private NewsDao newsDao;

	@Override
	public List<NewsView> getAllNewsViewsByTimeDesc(boolean isChinese) {
		List<News> newsList = newsDao.findAll();
		List<NewsView> newsViews = new ArrayList<>();
		for (News news : newsList) {
			NewsView newView = new NewsView(news, isChinese);
			newsViews.add(newView);
		}
		return newsViews;
	}

}
