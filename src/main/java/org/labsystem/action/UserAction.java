package org.labsystem.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.labsystem.service.UserService;

@Action("user") // 使用struts创建action
@Results({ // 注解为action的返回页面
		@Result(name = "index", location = "/index.jsp"), @Result(name = "input", location = "/login.jsp"),
		@Result(name = "error", location = "/error.jsp") })
@ExceptionMappings({ // 声明式异常处理
		@ExceptionMapping(exception = "java.lang.Exception", result = "error") })
public class UserAction extends BaseAction {
	private static final long serialVersionUID = 1L;

	private String username;
	private String password;

	@Resource
	private UserService userService;

	/**
	 * 用户登录
	 * 
	 * @return
	 */
	public String login() {
		if (userService.checkUser(username, password)) {
			super.getSession().put("username", username);
			return "index";
		} else {
			// addActionMessage("username or password error!");
			return "input";
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
