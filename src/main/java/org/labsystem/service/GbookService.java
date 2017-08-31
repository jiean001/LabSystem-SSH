package org.labsystem.service;

import java.util.List;

import javax.annotation.Resource;

import org.labsystem.dao.GbookDao;
import org.labsystem.entity.Gbook;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service//spring管理对象
@Transactional//注册事务 为此类中所有方法添加事务
public class GbookService {

	@Resource
	private GbookDao gbookDao;


	//获取用户列表
	public List<Gbook> getGbookList(int begin, int rows) {
		return gbookDao.getPartGbook(begin, rows);
	}

	//获取用户总数
	public int getGbookTotal(){
		return gbookDao.getAllGbook().size();
	}

	//删除用户
	public boolean deleteGbook(Gbook gbook) {
		return gbookDao.delete(gbook);
	}

	//添加留言
	public boolean addGbook(Gbook gbook) {
		return gbookDao.insert(gbook) > 0;
	}


}
