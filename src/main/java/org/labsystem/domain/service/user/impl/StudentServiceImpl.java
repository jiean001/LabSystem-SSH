package org.labsystem.domain.service.user.impl;

import java.util.ArrayList;
import java.util.List;

import org.labsystem.domain.dao.iface.EdubkgrdDao;
import org.labsystem.domain.dao.iface.StudentDao;
import org.labsystem.domain.dao.iface.StuyearDao;
import org.labsystem.domain.entity.Student;
import org.labsystem.domain.entity.Stuyear;
import org.labsystem.domain.service.user.iface.StudentService;
import org.labsystem.web.user.view.EducationBackGroundView;
import org.labsystem.web.user.view.StudentSimplyView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("StudentService")
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StuyearDao stuyearDao;
	@Autowired
	private StudentDao studentDao;
	@Autowired
	private EdubkgrdDao edubkgrdDao;

	@Override
	public List<String> getAllYears() {
		return stuyearDao.getAllYears();
	}

	@Override
	public List<StudentSimplyView> getStudentsByYear(String year, boolean isChinese) {
		List<Stuyear> stuyears = stuyearDao.getAllStuyear(year);
		List<StudentSimplyView> studentSimplyViews = new ArrayList<>();
		for (Stuyear stuyear : stuyears) {
			Student stu = studentDao.get(stuyear.getStuId());
			EducationBackGroundView edubkgrdV = new EducationBackGroundView(edubkgrdDao.get(stu.getEdubkgrdId()),
					isChinese);
			StudentSimplyView tmpView = new StudentSimplyView(stu, edubkgrdV, isChinese);
			studentSimplyViews.add(tmpView);
		}
		return studentSimplyViews;
	}

}
