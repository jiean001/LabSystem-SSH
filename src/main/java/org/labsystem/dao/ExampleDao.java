package org.labsystem.dao;

import java.util.List;

import org.labsystem.entity.Example;
import org.springframework.stereotype.Repository;

@Repository // 注册dao曾bean等同于@Component
@SuppressWarnings("unchecked")
public class ExampleDao extends BaseDao {

	// 获取所有案例
	public List<Example> getAllExamples() {
		return getSession().createQuery("from Example").list();
	}

	// 获取某类别所有案例
	public List<Example> getAllExamples(int type) {
		return getSession().createQuery("from Example where category_id=:type").setParameter("type", type).list();
	}

	// 获取部分案例信息
	public List<Example> getExampleList(int begin, int rows) {
		return getSession().createQuery("from Example order by id desc").setFirstResult(begin).setMaxResults(rows)
				.list();
	}

	// 按产品类型获取部分产品
	public List<Example> getExampleList(int begin, int rows, int type) {
		return getSession().createQuery("from Example where category_id=:type order by id desc")
				.setInteger("type", type).setFirstResult(begin).setMaxResults(rows).list();
	}

	// 通过id查找产品
	public Example getExampleById(int id) {
		return (Example) getSession().createQuery("from Example where id=:id").setParameter("id", id).uniqueResult();
	}

}
