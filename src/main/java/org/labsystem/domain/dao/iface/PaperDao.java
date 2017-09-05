package org.labsystem.domain.dao.iface;

import org.labsystem.domain.entity.Paper;

public interface PaperDao extends GenericDao<Paper, Integer> {
	Paper getPaper(int id);
}
