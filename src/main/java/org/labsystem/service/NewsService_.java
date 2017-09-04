package org.labsystem.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.labsystem.dao.NewsDao;
import org.labsystem.entity.News_;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service // spring管理对象
@Transactional // 注册事务 为此类中所有方法添加事务
public class NewsService_ {

	@Resource
	private NewsDao newsDao;

	// 获取列表
	public List<News_> getNewsList(int begin, int rows) {
		return newsDao.getNewsList(begin, rows);
	}

	// 获取总数
	public int getNewsTotal() {
		return newsDao.getAllNews().size();
	}

	// 添加新闻
	public boolean addNews(News_ news) {
		news.setTime(new Date());
		return newsDao.insert(news) > 0;
	}

	// 修改新闻
	public boolean updateNews(News_ news) {
		return newsDao.update(news);
	}

	// 删除新闻
	public boolean deleteNews(News_ news) {
		return newsDao.delete(news);
	}

	// 获取前五条最新新闻, 放于首页
	public List<News_> getNewsIndex() {
		return newsDao.getNewsList(0, 5);
	}

	// 通过id获取单个新闻
	public News_ getNewsById(int id) {
		return newsDao.getNews(id);
	}

}
