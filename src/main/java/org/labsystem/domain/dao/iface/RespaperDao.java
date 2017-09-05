package org.labsystem.domain.dao.iface;

import java.util.List;

import org.labsystem.domain.view.PaperSimpleView;
import org.labsystem.entity.Research;
import org.labsystem.entity.Respaper;

public interface RespaperDao extends GenericDao<Respaper, Integer> {
	Respaper get(Integer id);

	List<PaperSimpleView> getPaperSimpleByResearch(Research research, boolean isChinese);
}
