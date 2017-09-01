package org.labsystem.domain.service.impl;

import java.util.Date;
import java.util.List;

import org.labsystem.dao.iface.PaperDao;
import org.labsystem.domain.service.iface.PaperService;
import org.labsystem.entity.Paper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("PaperService") // 注解为service层spring管理bean
@Transactional // 注解此类所有方法加入spring事务, 具体设置默认
public class PaperServiceImpl implements PaperService {
	@Autowired
	private PaperDao paperDao;

	@Override
	public List<Paper> getPaperByTime(Date starttime, Date endTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Paper> getAllPaper() {
		return paperDao.findAll();
	}

	@Override
	public boolean addPaper(Paper paper) {
		return paperDao.insert(paper) > 0;
	}

	@Override
	public boolean updatePaper(Paper paper) {
		return paperDao.update(paper);
	}

	@Override
	public boolean deletePaper(Paper paper) {
		return paperDao.delete(paper);
	}

}
