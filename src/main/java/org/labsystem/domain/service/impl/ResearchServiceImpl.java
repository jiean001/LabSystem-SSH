package org.labsystem.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.labsystem.domain.dao.iface.ResearchfieldDao;
import org.labsystem.domain.service.iface.ResearchService;
import org.labsystem.entity.Researchfield;
import org.labsystem.web.view.ResearchFieldView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ResearchService")
@Transactional
public class ResearchServiceImpl implements ResearchService {
	@Autowired
	private ResearchfieldDao researchfieldDao;

	@Override
	public List<ResearchFieldView> getAllResearchFieldView(boolean isChinese) {
		//获取全部的研究领域
		List<Researchfield> researchfields = researchfieldDao.findAll();
		List<ResearchFieldView> researchFieldViews = new ArrayList<>();
		//遍历并返回研究领域的视图
		for(Researchfield rschfd: researchfields) {
			if(null == rschfd) {
				continue;
			}
			ResearchFieldView tmpView = new ResearchFieldView(rschfd, isChinese);
			researchFieldViews.add(tmpView);
		}
		return researchFieldViews;
	}

}
