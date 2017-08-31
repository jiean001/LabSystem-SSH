package org.labsystem.dao;

import java.util.List;

import org.labsystem.entity.Product;
import org.springframework.stereotype.Repository;

@Repository//注册dao曾bean等同于@Component
@SuppressWarnings("unchecked")
public class ProductDao extends BaseDao {


	//获取首页展示的产品
	public List<Product> getShowProducts(int rows) {
		return getSession().createQuery("from Product where shown=1 order by id desc").setMaxResults(rows).list();
	}

	//获取所以产品
	public List<Product> getAllProducts() {
		return getSession().createQuery("from Product").list();
	}

	//获取某类别所以产品
	public List<Product> getAllProducts(int type) {
		return getSession().createQuery("from Product where category_id=:type")
				.setParameter("type", type).list();
	}

	//随机获取产品信息
	public List<Product> getProductList(int begin, int rows) {
		return getSession().createQuery("from Product order by id desc")
				.setFirstResult(begin).setMaxResults(rows).list();
	}

	//随机获取部分产品信息
	public List<Product> getPartProductRandom(int begin, int rows) {
		return getSession().createQuery("from Product order by rand()")
				.setFirstResult(begin).setMaxResults(rows).list();
	}

	//按产品类型获取部分产品
	public List<Product> getPartProduct(int begin, int rows, int type) {
		return getSession().createQuery("from Product where category_id=:type order by id desc")
				.setInteger("type", type).setFirstResult(begin).setMaxResults(rows).list();
	}

	//通过id查找产品
	public Product getProduct(int id) {
		return (Product) getSession().createQuery("from Product where id=:id")
				.setParameter("id", id).uniqueResult();
	}

}
