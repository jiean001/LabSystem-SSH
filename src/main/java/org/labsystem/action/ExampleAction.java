package org.labsystem.action;

import java.io.File;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.labsystem.entity.Category;
import org.labsystem.entity.Example;
import org.labsystem.service.CategoryService;
import org.labsystem.service.ExampleService;
import org.labsystem.util.PageUtil;
import org.labsystem.util.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;

@Results({
	@Result(name="list", location="/admin/example_list.jsp"),
	@Result(name="add", location="/admin/example_add.jsp"),
	@Result(name="edit", location="/admin/example_edit.jsp"),
	@Result(name="relist", type="redirect", location="exampleList.action"),
})
public class ExampleAction extends BaseAction{

	private Example example;
	private List<Example> exampleList;
	private List<Category> categoryList;

	// 由status2自动将上传文件进行装配到以下属性
	private File upload;		//获取上传文件
	private String uploadFileName;	//获取上传文件名称
	private String uploadContentType;		//获取上传文件类型

	@Autowired
	private ExampleService exampleService;
	@Autowired
	private CategoryService categoryService;


	/**
	 * 列表
	 * @return
	 */
	@Action("exampleList")
	public String list(){
		exampleList = exampleService.getExampleList((page-1)*rows,rows);
		pageTool = PageUtil.getPageTool(servletRequest, exampleService.getExampleTotal(), page, rows);
		return "list";
	}

	/**
	 * 编辑
	 * @return
	 */
	@Action("exampleAdd")
	public String add(){
		categoryList = categoryService.getCategoryList();
		return "add";
	}

	/**
	 * 保存
	 * @return
	 */
	@Action("exampleSave")
	public String save(){
		example.setPhoto(UploadUtil.fileUpload(upload, uploadFileName, "photo"));
		exampleService.addExample(example);
		return "relist";
	}

	/**
	 * 编辑
	 * @return
	 */
	@Action("exampleEdit")
	public String edit(){
		categoryList = categoryService.getCategoryList();
		example = exampleService.getExampleById(example.getId());
		return "edit";
	}

	/**
	 * 更新
	 * @return
	 */
	@Action("exampleUpdate")
	public String update(){
		String photo = UploadUtil.fileUpload(upload, uploadFileName, "photo");
		if (photo!=null && !photo.trim().isEmpty()) {
			example.setPhoto(photo);
		}
		if(exampleService.updateExample(example)){
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
	@Action("exampleDelete")
	public String delete(){
		exampleService.deleteExample(example);
		return "relist";
	}


	public Example getExample() {
		return example;
	}

	public void setExample(Example example) {
		this.example = example;
	}

	public List<Example> getExampleList() {
		return exampleList;
	}

	public void setExampleList(List<Example> exampleList) {
		this.exampleList = exampleList;
	}

	public List<Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

}
