package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.web.view.NewsView;

public interface LatestNewsService {
	List<NewsView> getAllNewsViewsByTimeDesc(boolean isChinese);
}
