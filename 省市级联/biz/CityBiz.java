package biz;

import java.util.List;

import bean.CityInfo;
import dao.CityInfoDAO;

public class CityBiz {

	private CityInfoDAO cidao = new CityInfoDAO();
	
	public List<CityInfo> findByProvinceId(String provinceId){
		return cidao.findByProvinceId(provinceId);
	}
}
