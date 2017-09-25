package org.labsystem.domain.service.user.iface;

import java.util.List;

import org.labsystem.web.user.view.NewsView;

public interface LatestNewsService {
	List<NewsView> getAllNewsViewsByTimeDesc(boolean isChinese);
}
