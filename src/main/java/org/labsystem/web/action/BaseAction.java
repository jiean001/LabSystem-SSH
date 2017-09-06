package org.labsystem.web.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.labsystem.util.Config;

/**
 * action基类继承自ActionSupport类 实现一些接口持有一些实用对象 向子类提供分页参数
 */
public class BaseAction implements SessionAware, RequestAware, ServletRequestAware, ServletResponseAware {

	/** 持有对象 */
	protected Map<String, Object> session;
	protected Map<String, Object> request;
	protected HttpServletRequest servletRequest;
	protected HttpServletResponse servletResponse;

	/** 分页参数 */
	protected int page = 1; // 当前页码
	protected int pages = 1; // 总页数
	protected int rows = 9; // 每页记录数
	protected String pageTool;

	@Override // 重写自父接口SessionAware的方法,有容器自行调用并给session对象赋值
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override // 重写自父接口RequestAware的方法,有容器自行调用并给request对象赋值
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	@Override // 重写自父接口ServletRequestAware的方法,有容器自行调用并给Servletrequest对象赋值
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;

	}

	@Override // 重写自父接口ServletResponseAware的方法,有容器自行调用并给Servletresponse对象赋值
	public void setServletResponse(HttpServletResponse servletResponse) {
		this.servletResponse = servletResponse;
	}

	// 用于在子类中获取session对象
	public Map<String, Object> getSession() {
		return session;
	}

	// 用于在子类中获取request对象
	public Map<String, Object> getRequest() {
		return request;
	}

	// 用于在子类中获取servletRequest对象
	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}

	// 用于在子类中获取servletResponse对象
	public HttpServletResponse getServletResponse() {
		servletResponse.setCharacterEncoding("utf-8");
		return servletResponse;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public String getPageTool() {
		return pageTool;
	}

	public void setPageTool(String pageTool) {
		this.pageTool = pageTool;
	}

	public boolean getLanguage() {
		return (this.getSession().get(Config.LANGUAGE) == null || this.getSession().get(Config.LANGUAGE) == "")  ?
				Config.DEFAULTLANGUAGE : (boolean) this.getSession().get(Config.LANGUAGE);
	}

	public void setLanguage(boolean isChinese) {
		this.getSession().put(Config.LANGUAGE, isChinese);
	}
}
