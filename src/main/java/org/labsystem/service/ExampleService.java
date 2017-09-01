package org.labsystem.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.labsystem.dao.ExampleDao;
import org.labsystem.entity.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service // spring管理对象
@Transactional // 注册事务 为此类中所有方法添加事务
public class ExampleService {

	@Resource
	private ExampleDao exampleDao;

	// 添加案例
	public boolean addExample(Example example) {
		example.setTime(new Date());
		return exampleDao.insert(example) > 0;
	}

	// 更新案例
	public boolean updateExample(Example example) {
		example.setTime(new Date());
		return exampleDao.update(example);
	}

	// 获取案例总数
	public int getExampleTotal() {
		return exampleDao.getAllExamples().size();
	}

	// 获取案例总数
	public int getExampleTotal(int type) {
		return exampleDao.getAllExamples(type).size();
	}

	// 获取所以案例列表 (默认按id降序排序)
	public List<Example> getExampleList(int begin, int rows) {
		return exampleDao.getExampleList(begin, rows);
	}

	// 按类别获取所有案例列表 (默认按id降序排序)
	public List<Example> getExampleList(int begin, int rows, int type) {
		return exampleDao.getExampleList(begin, rows, type);
	}

	// 删除案例
	public boolean deleteExample(Example example) {
		return exampleDao.delete(example);
	}

	// 通过id获取
	public Example getExampleById(int id) {
		return exampleDao.getExampleById(id);
	}

}
