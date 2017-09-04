package org.labsystem.service;

import java.util.Date;

import org.apache.log4j.Logger;
import org.labsystem.domain.service.iface.NewsService;
import org.labsystem.entity.News;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;

public class TestNewsService {
	private static final Logger LOGGER = Logger.getLogger(TestNewsService.class);

	@Autowired
	private NewsService newsService;
	News tmpNews;

	void testAddNews() {
		News news = new News("新闻1", "news1", "这是新闻1的内容", "this is the content of newsa", new Date());
		LOGGER.info("testAddNews: " + JSON.toJSONString(newsService.addNews(news)));
	}

	void testGetNews() {
		tmpNews = newsService.getNews(1);
		LOGGER.info("testGetNews: " + JSON.toJSONString(tmpNews));
	}

	void testModifyNews() {
		tmpNews.setNewscontentC("这是新闻2的内容");
		LOGGER.info("testModifyNews: " + JSON.toJSONString(newsService.modifyNews(tmpNews)));
	}

	void testGetAllNews() {
		LOGGER.info("testGetAllNews: " + JSON.toJSONString(newsService.getAllNews()));
	}

	void testDeleteNews() {
		LOGGER.info("testDeleteNews: " + JSON.toJSONString(newsService.deleteNews(tmpNews)));
	}

	public void testMain() {
		testAddNews();
		testGetNews();
		testModifyNews();
		testGetAllNews();
		testDeleteNews();
	}

}
