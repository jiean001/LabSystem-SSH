package org.labsystem.domain.service.admin.iface;

import java.util.List;

import org.labsystem.domain.entity.Edubkgrd;
import org.labsystem.domain.entity.LaboratoryInfo;
import org.labsystem.domain.entity.News;
import org.labsystem.domain.entity.Source;

public interface AdminService extends BaseService {
	/*学历表--一般不对学历表进行写操作*/
	boolean addNewEdubkgrd(Edubkgrd edubkgrd);
	boolean updateEdubkgrd(Edubkgrd edubkgrd);
	boolean deleteEdubkgrd(Edubkgrd edubkgrd);

	/*实验室信息表--这个表设计只能修改，不能删除和新加*/
	boolean updateLaboratory(LaboratoryInfo laboratoryInfo);

	/*新闻表*/
	boolean addNews(News news);
	boolean updateNews(News news);
	boolean deleteNews(News news);
	//显示在管理员界面的新闻
	List<News> getAllNewsByTimeDesc();

	/*Source表 论文所属的表*/
	boolean addSource(Source source);
	boolean updateSource(Source source);
	boolean deleteSource(Source source);

	/**/
}
