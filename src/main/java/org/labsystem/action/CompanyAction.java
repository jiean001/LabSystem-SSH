package org.labsystem.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.labsystem.entity.Company;
import org.labsystem.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;

@Results({
	@Result(name="edit", location="/admin/company_edit.jsp"),
})
public class CompanyAction extends BaseAction{

	private Company company;

	@Autowired
	private CompanyService companyService;


	/**
	 * 公司信息
	 * @return
	 */
	@Action("companyEdit")
	public String edit(){
		company = companyService.getCompany();
		return "edit";
	}

	/**
	 * 修改公司信息
	 * @return
	 */
	@Action("companyUpdate")
	public String update(){
		if(companyService.updateCompany(company)){
			getRequest().put("msg", "更新成功!");
		}else{
			getRequest().put("msg", "更新失败!");
		}
		return edit();
	}


	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
