package org.labsystem.service;

import org.labsystem.dao.AdminDao;
import org.labsystem.entity.Admin;
import org.labsystem.util.SafeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service	// 注解为service层spring管理bean
@Transactional	// 注解此类所有方法加入spring事务, 具体设置默认
public class AdminService {

	@Autowired		//spring注入类对象
	private AdminDao adminDao;


	/**
	 * 验证用户密码
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean checkUser(String username, String password){
		Admin user = adminDao.selectByUsername(username);
		return user!=null && user.getPassword().equals(SafeUtil.encode(password));
	}

	/**
	 * 通过id获取
	 * @param userid
	 * @return
	 */
	public Admin getByUsername(String username){
		return adminDao.selectByUsername(username);
	}

	/**
	 * 更新
	 * @param admin
	 */
	public boolean update(Admin admin) {
		Admin oldUser = getByUsername(admin.getUsername());
		// 更新前先验证密码是否正确
		if (oldUser.getPassword().equals(SafeUtil.encode(admin.getPassword()))) {
			oldUser.setUsername(admin.getUsername());
			oldUser.setPassword(SafeUtil.encode(admin.getPasswordNew()));
			return adminDao.update(oldUser);
		}
		return false;
	}

}
