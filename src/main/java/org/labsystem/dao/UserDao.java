package org.labsystem.dao;

import java.util.List;

import org.labsystem.entity.User;
import org.springframework.stereotype.Repository;

@Repository // 注册dao层bean等同于@Component
public class UserDao extends BaseDao{

	
	/**
	 * 通过用户名查找用户
	 * @return 无记录返回null
	 */
	public User getByUsername(String username){
		return (User) getSession().createQuery("from User where username=:username")
				.setString("username", username).uniqueResult();	// HQL语句方式
	}
	
	/**
	 * 通过用户名和密码查找用户
	 * @param username
	 * @param password
	 * @return 无记录返回null
	 */
	public User getByUsernameAndPassword(String username, String password){
		return (User)getSession().createSQLQuery("select * from user where username=? and password=?")
				.addEntity(User.class).setString(0, username).setString(1, password).uniqueResult();	// SQL语句方式
	}
	
	/**
	 * 获取列表
	 * @param page
	 * @param rows
	 * @return 无记录返回空集合
	 */
	@SuppressWarnings("unchecked")
	public List<User> getList(int page, int rows){
		return getSession().createQuery("from User").setFirstResult(rows*(page-1)).setMaxResults(rows).list();
	}
	
}
