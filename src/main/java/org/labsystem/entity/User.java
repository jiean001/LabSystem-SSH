package org.labsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // 注解为hibernate实体 对应数据库中user表
public class User {
	
	@Id	// 注解主键
	@GeneratedValue //id生成策略  默认auto 相当于hibernate的native - 自增字段
	private int userid;
	private String username;
	private String password;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
