package org.labsystem.dao;

import java.util.List;

import org.labsystem.entity.Gbook;
import org.springframework.stereotype.Repository;

@Repository // 注册dao曾bean等同于@Component
@SuppressWarnings("unchecked")
public class GbookDao extends BaseDao {

	// 分页查询部分留言//先排序再分页
	public List<Gbook> getPartGbook(int begin, int rows) {
		return getSession().createQuery("from Gbook order by id desc").setFirstResult(begin).setMaxResults(rows).list();
	}

	// 获取所以留言
	public List<Gbook> getAllGbook() {
		return getSession().createQuery("from Gbook").list();
	}

}
