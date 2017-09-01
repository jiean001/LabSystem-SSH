package org.labsystem.service;

import javax.annotation.Resource;

import org.labsystem.dao.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service // 注解为service层spring管理bean
@Transactional // 注解此类所有方法加入spring事务, 具体设置默认
public class UserService {

	@Resource // spring注入类对象
	private UserDao userDao;

	/**
	 * 验证用户密码
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean checkUser(String username, String password) {
		return userDao.getByUsernameAndPassword(username, password) != null;
	}

}
