package org.labsystem.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

// 使用spring创建的action, className为spring中的bean名称
@Action(value = "error", className = "errorAction")
@Results({ // 注解为名为actiong的返回页面
		@Result(name = "error", location = "/error.jsp") })
@ExceptionMappings({ // 声明式异常处理
		@ExceptionMapping(exception = "java.lang.Exception", result = "error") })
@Controller() // 注解spring管理bean, 默认name是首字母小写
@Scope("prototype") // 使用多例注入, 默认singleton
public class ErrorAction {

	private Object object;

	/**
	 * 测试异常处理
	 * 
	 * @return 可在方法action下单独注册action, 两种访问方式都有效 使用spring创建的action,
	 *         className为spring中的bean名称
	 */
	@Action(value = "error", className = "errorAction")
	public void error() {
		System.out.println(this.hashCode());
		object.toString(); // 抛出NullPointerException
	}

}
