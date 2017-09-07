package org.labsystem.domain.dao.iface;

import java.util.List;

import org.labsystem.domain.entity.Paperbelong;

public interface PaperbelongDao extends GenericDao<Paperbelong, Integer> {
	Paperbelong get(Integer id);
	
	List<Paperbelong> getPaperbelongs(boolean isStu, int personID);
}
