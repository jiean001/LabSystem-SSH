package org.labsystem.action;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.labsystem.entity.Gbook;
import org.labsystem.service.GbookService;
import org.labsystem.util.PageUtil;

@Results({
	@Result(name="gbook",location="/index/gbook.jsp"),
	@Result(name="list",location="/admin/gbook_list.jsp"),
	@Result(name="relist", type="redirect", location="gbookList.action"),
})
public class GbookAction extends BaseAction{

	private Gbook gbook;
	private List<Gbook> gbookList;

	@Resource
	private GbookService gbookService;


	/**
	 * 列表
	 * @return
	 */
	@Action("gbookList")
	public String list(){
		gbookList = gbookService.getGbookList((page-1)*rows, rows);
		pageTool = PageUtil.getPageTool(servletRequest, gbookService.getGbookTotal(), page, rows);
		return "list";
	}

	/**
	 * 删除
	 * @return
	 */
	@Action("gbookDelete")
	public String delete(){
		gbookService.deleteGbook(gbook);
		return "relist";
	}


	/**
	 * 添加留言
	 * @return
	 * @throws IOException
	 */
	@Action("gbookAdd")
	public void add() throws IOException{
		getServletResponse().getWriter().print(gbookService.addGbook(gbook));
	}


	public Gbook getGbook() {
		return gbook;
	}
	public void setGbook(Gbook gbook) {
		this.gbook = gbook;
	}
	public List<Gbook> getGbookList() {
		return gbookList;
	}
	public void setGbookList(List<Gbook> gbookList) {
		this.gbookList = gbookList;
	}

}
