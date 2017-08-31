package org.labsystem.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.labsystem.dao.ProductDao;
import org.labsystem.entity.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service//spring管理对象
@Transactional//注册事务 为此类中所有方法添加事务
public class ProductService {

	@Resource
	private ProductDao productDao;


	//获取首页展示的产品
	public List<Product> getShowProducts(int rows) {
		return productDao.getShowProducts(rows);
	}

	//添加产品
	public boolean addProduct(Product product) {
		product.setTime(new Date());
		return productDao.insert(product) > 0;
	}

	//更新产品
	public boolean updateProduct(Product product) {
		product.setTime(new Date());
		return productDao.update(product);
	}

	//获取产品总数
	public int getProductTotal() {
		return productDao.getAllProducts().size();
	}

	//获取某类别产品总数
	public int getProductTotal(int type) {
		return productDao.getAllProducts(type).size();
	}

	//获取首页展示产品总数
	public int getShowTotal() {
		return productDao.getShowProducts(6).size();
	}

	//获取所有产品列表
	public List<Product> getProductList(int begin, int rows) {
		return productDao.getProductList(begin ,rows);
	}

	//获取所有产品列表	(随机)
	public List<Product> getPartProductRandom(int begin, int rows) {
		return productDao.getPartProductRandom(begin ,rows);
	}

	//按类别获取所有产品列表	(默认按时间降序排序)
	public List<Product> getProductList(int begin, int rows, int type) {
		return productDao.getPartProduct(begin, rows, type);
	}

	//通过id查找产品
	public Product getProductById(int id) {
		return productDao.getProduct(id);
	}

	// 删除产品
	public boolean deleteProduct(Product product){
		return productDao.delete(product);
	}

}
