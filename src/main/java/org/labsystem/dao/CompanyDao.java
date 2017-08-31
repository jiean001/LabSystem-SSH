package org.labsystem.dao;

import org.labsystem.entity.Company;
import org.springframework.stereotype.Repository;


@Repository//注册dao层bean等同于@Component
public class CompanyDao extends BaseDao{

	//获取公司信息
	public Company getCompany(){
		return (Company) getSession().createQuery("from Company").uniqueResult();
	}

}
