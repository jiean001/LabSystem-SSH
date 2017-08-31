package org.labsystem.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.labsystem.entity.News;
import org.labsystem.service.NewsService;
import org.labsystem.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;

@Results({
	@Result(name="list", location="/admin/news_list.jsp"),
	@Result(name="add", location="/admin/news_add.jsp"),
	@Result(name="edit", location="/admin/news_edit.jsp"),
	@Result(name="relist", type="redirect", location="newsList.action"),
})
public class NewsAction extends BaseAction{

	private int rows = 5;

	private News news;
	private List<News> newsList;

	@Autowired
	private NewsService newsService;


	/**
	 * 列表
	 * @return
	 */
	@Action("newsList")
	public String list(){
		newsList = newsService.getNewsList((page-1)*rows,rows);
		pageTool = PageUtil.getPageTool(servletRequest, newsService.getNewsTotal(), page, rows);
		return "list";
	}

	/**
	 * 编辑
	 * @return
	 */
	@Action("newsAdd")
	public String add(){
		return "add";
	}

	/**
	 * 保存
	 * @return
	 */
	@Action("newsSave")
	public String save(){
		newsService.addNews(news);
		return "relist";
	}

	/**
	 * 编辑
	 * @return
	 */
	@Action("newsEdit")
	public String edit(){
		news = newsService.getNewsById(news.getId());
		return "edit";
	}

	/**
	 * 更新
	 * @return
	 */
	@Action("newsUpdate")
	public String update(){
		if(newsService.updateNews(news)){
			getRequest().put("msg", "更新成功!");
		}else{
			getRequest().put("msg", "更新失败!");
		}
		return "relist";
	}

	/**
	 * 删除
	 * @return
	 */
	@Action("newsDelete")
	public String delete(){
		newsService.deleteNews(news);
		return "relist";
	}


	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public List<News> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<News> newsList) {
		this.newsList = newsList;
	}

}
