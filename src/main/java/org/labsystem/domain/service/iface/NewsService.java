package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.News;

public interface NewsService {
	List<News> getAllNews();

	News getNews(int id);

	boolean addNews(News news);

	boolean modifyNews(News news);

	boolean deleteNews(News news);
}
