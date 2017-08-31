package org.labsystem.dao;

import org.labsystem.entity.Admin;
import org.springframework.stereotype.Repository;


@Repository // 注册dao层bean等同于@Component
public class AdminDao extends BaseDao{


	/**
	 * 通过用户名查找用户
	 * @return 无记录返回null
	 */
	public Admin selectByUsername(String username){
		return (Admin) getSession().createQuery("from Admin where username=:username")
				.setString("username", username).uniqueResult();	// HQL语句方式
	}

}
