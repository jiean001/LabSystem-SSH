package org.labsystem.dao;

import java.util.List;

import org.labsystem.entity.Category;
import org.springframework.stereotype.Repository;

@Repository//注册dao曾bean等同于@Component
@SuppressWarnings("unchecked")
public class CategoryDao extends BaseDao{

	//获取全部产品类别(默认按序号排列)
	public List<Category> getCategoryList() {
		return getSession().createQuery("from Category order by id desc").list();
	}

	//分页获取类目
	public List<Category> getCategoryList(String sortname, String sortorder, int begin, int rows) {
		return getSession().createQuery("from Category order by "+sortname+" "+sortorder)
				.setFirstResult(begin).setMaxResults(rows).list();
	}

}
