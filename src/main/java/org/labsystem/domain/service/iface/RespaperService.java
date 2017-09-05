package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.domain.view.PaperSimpleView;
import org.labsystem.entity.Research;
import org.labsystem.entity.Respaper;

public interface RespaperService {
	boolean addRespaper(Respaper entity);

	boolean modifyRespaper(Respaper entity);

	boolean deleteRespaper(Respaper entity);

	Respaper getRespaper(int id);

	List<PaperSimpleView> getPaperSimpleByResearch(Research research, boolean isChinese);

}
