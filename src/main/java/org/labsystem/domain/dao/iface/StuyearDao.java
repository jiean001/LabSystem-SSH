package org.labsystem.domain.dao.iface;

import java.util.List;

import org.labsystem.domain.entity.Stuyear;

public interface StuyearDao extends GenericDao<Stuyear, Integer> {
	Stuyear get(int id);

	List<String> getAllYears();

	List<Stuyear> getAllStuyear(String year);
}
