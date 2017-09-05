package org.labsystem.domain.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.labsystem.domain.dao.iface.PaperDao;
import org.labsystem.domain.dao.iface.ReschfldresDao;
import org.labsystem.domain.dao.iface.ResearchDao;
import org.labsystem.domain.dao.iface.ResearchfieldDao;
import org.labsystem.domain.dao.iface.RespaperDao;
import org.labsystem.domain.service.iface.ResearchService;
import org.labsystem.entity.Paper;
import org.labsystem.entity.Reschfldres;
import org.labsystem.entity.Research;
import org.labsystem.entity.Researchfield;
import org.labsystem.entity.Respaper;
import org.labsystem.web.view.PaperSimpleView;
import org.labsystem.web.view.ResearchDetailsView;
import org.labsystem.web.view.ResearchFieldView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ResearchService")
@Transactional
public class ResearchServiceImpl implements ResearchService {
	@Autowired
	private ResearchfieldDao researchfieldDao;
	@Autowired
	private ReschfldresDao reschfldresDao;
	@Autowired
	private ResearchDao researchDao;
	@Autowired
	private RespaperDao resPaperDao;
	@Autowired
	private PaperDao paperDao;

	@Override
	public List<ResearchFieldView> getAllResearchFieldView(boolean isChinese) {
		// 获取全部的研究领域
		List<Researchfield> researchfields = researchfieldDao.findAll();
		List<ResearchFieldView> researchFieldViews = new ArrayList<>();
		// 遍历并返回研究领域的视图
		for (Researchfield rschfd : researchfields) {
			if (null == rschfd) {
				continue;
			}
			ResearchFieldView tmpView = new ResearchFieldView(rschfd, isChinese);
			researchFieldViews.add(tmpView);
		}
		return researchFieldViews;
	}

	@Override
	public List<ResearchDetailsView> getResearchDetailsViewByResearchField(Researchfield researchfield,
			boolean isChinese) {
		// 先从reschfldres表中获取到Reschfldres
		List<Reschfldres> reschfldreslist = reschfldresDao.getReschfldresByReschfld(researchfield);
		// 再research表中获取到research list
		List<ResearchDetailsView> ResearchDetailsViews = new ArrayList<>();
		for (Reschfldres reschfldres : reschfldreslist) {
			if (null == reschfldres) {
				continue;
			}
			Research research = researchDao.get(reschfldres.getResearchId());
			if (null == research) {
				continue;
			}
			List<Paper> papers = getPapersBySearch(research);
			List<PaperSimpleView> paperViews = getPaperSimpleViewsByPapers(papers, isChinese);
			ResearchDetailsView tmpView = new ResearchDetailsView(research, paperViews, isChinese);
			ResearchDetailsViews.add(tmpView);
		}
		return ResearchDetailsViews;
	}

	private List<Paper> getPapersBySearch(Research research) {
		List<Respaper> resPapers = resPaperDao.getRespaperByResearch(research);
		List<Paper> papers = new ArrayList<>();
		for (Respaper resPaper : resPapers) {
			if (null == resPaper) {
				continue;
			}
			Paper tmpPaper = paperDao.getPaper(resPaper.getPaperId());
			papers.add(tmpPaper);
		}
		return papers;
	}

	private List<PaperSimpleView> getPaperSimpleViewsByPapers(List<Paper> papers, boolean isChinese) {
		List<PaperSimpleView> paperSimpleViews = new ArrayList<>();
		for (Paper paper : papers) {
			PaperSimpleView tmpView = new PaperSimpleView(paper, isChinese);
			paperSimpleViews.add(tmpView);
		}
		return paperSimpleViews;
	}

	@Override
	public Researchfield getResearchfield(int id) {
		return researchfieldDao.getResearchfield(id);
	}

}
