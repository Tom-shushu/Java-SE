package biz;

import java.util.List;

import bean.AreaInfo;
import dao.AreaInfoDAO;

public class AreaBiz {

	private AreaInfoDAO aidao = new AreaInfoDAO();

	public List<AreaInfo> findByCityId(String cityId){
		return aidao.findByCityId(cityId);
	}
}
