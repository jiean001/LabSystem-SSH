package org.labsystem.dao;

import java.util.List;

import org.labsystem.entity.News;
import org.springframework.stereotype.Repository;


@Repository//注册dao曾bean等同于@Component
@SuppressWarnings("unchecked")
public class NewsDao extends BaseDao {

	//分页查询部分新闻//先排序再分页
	public List<News> getNewsList(int begin, int rows) {
		return getSession().createQuery("from News order by id desc")
				.setFirstResult(begin).setMaxResults(rows).list();
	}

	//获取所以新闻(按时间排序)
	public List<News> getAllNews() {
		return getSession().createQuery("from News order by time desc").list();
	}

	//通过id查找单个新闻
	public News getNews(int id) {
		return (News) getSession().createQuery("from News where id=:id")
				.setInteger("id", id).uniqueResult();
	}

}
