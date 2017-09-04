package org.labsystem.domain.dao.iface;

import org.labsystem.entity.News;

public interface NewsDao extends GenericDao<News, Integer> {
	News get(Integer id);
}
