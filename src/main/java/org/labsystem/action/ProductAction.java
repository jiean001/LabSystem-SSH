package org.labsystem.action;

import java.io.File;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.labsystem.entity.Category;
import org.labsystem.entity.Product;
import org.labsystem.service.CategoryService;
import org.labsystem.service.ProductService;
import org.labsystem.util.PageUtil;
import org.labsystem.util.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;


@Results({
	@Result(name="list", location="/admin/product_list.jsp"),
	@Result(name="add", location="/admin/product_add.jsp"),
	@Result(name="edit", location="/admin/product_edit.jsp"),
	@Result(name="relist", type="redirect", location="productList.action"),
})
public class ProductAction extends BaseAction{

	private Product product;
	private List<Product> productList;
	private List<Category> categoryList;

	// 由status2自动将上传文件进行装配到以下属性
	private File upload;		//获取上传文件
	private String uploadFileName;	//获取上传文件名称
	private String uploadContentType;		//获取上传文件类型

	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;


	/**
	 * 列表
	 * @return
	 */
	@Action("productList")
	public String list(){
		productList = productService.getProductList((page-1)*rows,rows);
		pageTool = PageUtil.getPageTool(servletRequest, productService.getProductTotal(), page, rows);
		return "list";
	}

	/**
	 * 编辑
	 * @return
	 */
	@Action("productAdd")
	public String add(){
		categoryList = categoryService.getCategoryList();
		return "add";
	}

	/**
	 * 保存
	 * @return
	 */
	@Action("productSave")
	public String save(){
		product.setPhoto(UploadUtil.fileUpload(upload, uploadFileName, "photo"));
		productService.addProduct(product);
		return "relist";
	}

	/**
	 * 编辑
	 * @return
	 */
	@Action("productEdit")
	public String edit(){
		categoryList = categoryService.getCategoryList();
		product = productService.getProductById(product.getId());
		return "edit";
	}

	/**
	 * 更新
	 * @return
	 */
	@Action("productUpdate")
	public String update(){
		String photo = UploadUtil.fileUpload(upload, uploadFileName, "photo");
		if (photo!=null && !photo.trim().isEmpty()) {
			product.setPhoto(photo);
		}
		if(productService.updateProduct(product)){
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
	@Action("productDelete")
	public String delete(){
		productService.deleteProduct(product);
		return "relist";
	}


	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
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
