package org.labsystem.service;

import javax.annotation.Resource;

import org.labsystem.dao.CompanyDao;
import org.labsystem.entity.Company;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service // spring管理对象
@Transactional // 注册事务 为此类中所有方法添加事务
public class CompanyService {

	@Resource
	private CompanyDao companyDao;

	// 获取公司信息
	public Company getCompany() {
		return companyDao.getCompany();
	}

	// 修改公司信息
	public boolean updateCompany(Company company) {
		return companyDao.update(company);
	}

}
