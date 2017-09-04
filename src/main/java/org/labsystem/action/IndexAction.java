package org.labsystem.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.labsystem.entity.Category;
import org.labsystem.entity.Company;
import org.labsystem.entity.Example;
import org.labsystem.entity.News_;
import org.labsystem.entity.Product;
import org.labsystem.service.CategoryService;
import org.labsystem.service.CompanyService;
import org.labsystem.service.ExampleService;
import org.labsystem.service._NewsService;
import org.labsystem.service.ProductService;

@Results({ @Result(name = "index", location = "/index/index.jsp"), @Result(name = "news", location = "/index/news.jsp"),
		@Result(name = "product", location = "/index/product.jsp"),
		@Result(name = "example", location = "/index/example.jsp"),
		@Result(name = "scope", location = "/index/scope.jsp"), @Result(name = "gbook", location = "/index/gbook.jsp"),
		@Result(name = "about", location = "/index/about.jsp"),
		@Result(name = "newsmodel", location = "/index/news1.jsp"), // 新闻内容模版
		@Result(name = "productmodel", location = "/index/product1.jsp"), // 产品内容模版
		@Result(name = "examplemodel", location = "/index/example1.jsp") // 案例内容模版
})
public class IndexAction extends BaseAction {

	private int id;
	private int type;
	private News_ news;
	private Product product;
	private Example example;
	private Company company;
	private List<News_> newses;
	private List<Product> products;
	private List<Example> examples;
	private List<Category> categories;
	@Resource
	private _NewsService newsService;
	@Resource
	private ProductService productService;
	@Resource
	private ExampleService exampleService;
	@Resource
	private CompanyService companyService;
	@Resource
	private CategoryService categoryService;

	/**
	 * 前台首页
	 * 
	 * @return
	 */
	@Action("index")
	public String index() {
		newses = newsService.getNewsIndex(); // 获取最新新闻列表
		products = productService.getShowProducts(6); // 获取首页展示产品(默认取6条)
		company = companyService.getCompany();
		categories = categoryService.getCategoryList();
		return "index";
	}

	/**
	 * 新闻资讯
	 * 
	 * @return
	 */
	@Action("news")
	public String news() {
		pages = getPages(newsService.getNewsTotal(), rows); // 总页数
		newses = newsService.getNewsList((page - 1) * rows, rows); // 获取新闻列表
		company = companyService.getCompany();
		return "news";
	}

	/**
	 * 产品展示
	 * 
	 * @return
	 */
	@Action("product")
	public String product() {
		if (type == 0) { // 获取所有产品列表
			pages = getPages(productService.getProductTotal(), rows); // 总页数
			products = productService.getProductList((page - 1) * rows, rows);
		} else { // 按类别获取所以产品列表
			pages = getPages(productService.getProductTotal(type), rows); // 总页数
			products = productService.getProductList((page - 1) * rows, rows, type);
		}
		company = companyService.getCompany();
		categories = categoryService.getCategoryList();
		return "product";
	}

	/**
	 * 成功案例
	 * 
	 * @return
	 */
	@Action("example")
	public String example() {
		if (type == 0) { // 获取所有产品列表
			pages = getPages(exampleService.getExampleTotal(), rows); // 总页数
			examples = exampleService.getExampleList((page - 1) * rows, rows);
		} else { // 按类别获取所以产品列表
			pages = getPages(exampleService.getExampleTotal(type), rows); // 总页数
			examples = exampleService.getExampleList((page - 1) * rows, rows, type);
		}
		company = companyService.getCompany();
		categories = categoryService.getCategoryList();
		return "example";
	}

	/**
	 * 在线留言
	 * 
	 * @return
	 */
	@Action("gbook")
	public String gbook() {
		company = companyService.getCompany();
		return "gbook";
	}

	/**
	 * 关于我们
	 * 
	 * @return
	 */
	@Action("about")
	public String about() {
		company = companyService.getCompany();
		return "about";
	}

	/**
	 * 新闻内容模版
	 * 
	 * @return
	 */
	@Action("newsmodel")
	public String newsmodel() {
		news = newsService.getNewsById(id); // 通过id获取单个新闻信息
		company = companyService.getCompany();
		return "newsmodel";
	}

	/**
	 * 产品内容模版
	 * 
	 * @return
	 */
	@Action("productmodel")
	public String productmodel() {
		product = productService.getProductById(id); // 通过id获取单个新闻信息
		company = companyService.getCompany();
		categories = categoryService.getCategoryList();
		return "productmodel";
	}

	/**
	 * 案例内容模版
	 * 
	 * @return
	 */
	@Action("examplemodel")
	public String examplemodel() {
		example = exampleService.getExampleById(id); // 通过id获取单个新闻信息
		company = companyService.getCompany();
		categories = categoryService.getCategoryList();
		return "examplemodel";
	}

	/**
	 * 计算总页数
	 * 
	 * @param total
	 *            总记录数
	 * @param rows
	 *            每页记录数
	 * @return
	 */
	private int getPages(int total, int rows) {
		return total % rows == 0 ? total / rows : total / rows + 1;
	}

	public News_ getNews() {
		return news;
	}

	public void setNews(News_ news) {
		this.news = news;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Example getExample() {
		return example;
	}

	public void setExample(Example example) {
		this.example = example;
	}

	public List<News_> getNewses() {
		return newses;
	}

	public void setNewses(List<News_> newses) {
		this.newses = newses;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Example> getExamples() {
		return examples;
	}

	public void setExamples(List<Example> examples) {
		this.examples = examples;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

}
