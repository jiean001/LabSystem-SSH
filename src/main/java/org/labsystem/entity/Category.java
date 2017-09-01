package org.labsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // hibernate模型 对应数据库中news
@Table(name = "category") // 指定数据库中的表
public class Category {

	@Id
	@GeneratedValue // id生成策略 默认auto 相当于hibernate的native - 自增字段
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
