package org.labsystem.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.labsystem.entity.Category;
import org.labsystem.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

@Results({
	@Result(name="list", location="/admin/category_list.jsp"),
	@Result(name="relist", type="redirect", location="categoryList.action"),
})
public class CategoryAction extends BaseAction{

	private Category category;
	private List<Category> categoryList;

	@Autowired
	private CategoryService categoryService;


	/**
	 * 列表
	 * @return
	 */
	@Action("categoryList")
	public String list(){
		categoryList = categoryService.getCategoryList();
		return "list";
	}

	/**
	 * 保存
	 * @return
	 */
	@Action("categorySave")
	public String save(){
		categoryService.addCategory(category);
		return "relist";
	}

	/**
	 * 删除
	 * @return
	 */
	@Action("categoryDelete")
	public String delete(){
		categoryService.deleteCategory(category);
		return "relist";
	}


	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}

}
