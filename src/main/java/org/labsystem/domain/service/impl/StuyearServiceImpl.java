package org.labsystem.domain.service.impl;

import java.util.List;

import org.labsystem.domain.service.iface.StuyearService;
import org.labsystem.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("StuyearService")
@Transactional
public class StuyearServiceImpl implements StuyearService {

	@Override
	public List<Student> getStudentsByyear(String year) {
		// TODO Auto-generated method stub
		return null;
	}

}
