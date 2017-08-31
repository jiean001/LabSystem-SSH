package org.labsystem.service;

import java.util.List;

import javax.annotation.Resource;

import org.labsystem.dao.CategoryDao;
import org.labsystem.entity.Category;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service//spring管理对象
@Transactional//注册事务 为此类中所有方法添加事务
public class CategoryService {

	@Resource
	private CategoryDao categoryDao;

	//获取产品类目
	public List<Category> getCategoryList() {
		return categoryDao.getCategoryList();
	}

	//添加类目
	public boolean addCategory(Category category) {
		return categoryDao.insert(category) > 0;
	}

	//更新类目
	public boolean updateCategory(Category category) {
		return categoryDao.update(category);
	}

	//删除类目
	public boolean deleteCategory(Category category){
		return categoryDao.delete(category);
	}


}
