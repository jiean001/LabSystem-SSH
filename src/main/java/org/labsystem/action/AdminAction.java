package org.labsystem.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.labsystem.entity.Admin;
import org.labsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;


@Results({
	@Result(name="login", location="/admin/login.jsp"),
	@Result(name="edit", location="/admin/admin_edit.jsp"),
})
public class AdminAction extends BaseAction{

	private Admin admin;

	@Autowired
	private AdminService userService;


	/**
	 * 登录页面
	 */
	@Action("admin")
	public String admin(){
		return "login";
	}

	/**
	 * 登录
	 * @return
	 */
	@Action("adminLogin")
	public String login(){
		if (userService.checkUser(admin.getUsername(), admin.getPassword())) {
			getSession().put("username", admin.getUsername());
			return edit();
		}
		getRequest().put("msg", "用户名或密码错误!");
		return "login";
	}

	/**
	 * 编辑页面
	 * @return
	 */
	@Action("adminEdit")
	public String edit(){
		String username = String.valueOf(getSession().get("username"));
		admin = userService.getByUsername(username);
		return "edit";
	}

	/**
	 * 修改密码
	 * @return
	 */
	@Action("adminUpdate")
	public String update(){
		if (admin.getPassword()==null || admin.getPassword().trim().isEmpty()) {
			getRequest().put("msg", "原密码不能为空!");
			return edit();
		}
		if (admin.getPasswordNew()==null || admin.getPasswordNew().trim().isEmpty()) {
			getRequest().put("msg", "请输入新密码!");
			return edit();
		}
		if (userService.update(admin)) {
			getRequest().put("msg", "更新成功!");
		}else {
			getRequest().put("msg", "原密码错误!");
		}
		return edit();
	}


	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

}