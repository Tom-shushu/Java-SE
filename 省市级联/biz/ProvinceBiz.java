package biz;

import java.util.List;

import bean.ProvinceInfo;
import dao.ProvinceInfoDAO;

public class ProvinceBiz {

	private ProvinceInfoDAO pidao = new ProvinceInfoDAO();

	public List<ProvinceInfo> findAllProv() {
		return pidao.findAllProv();
	}
}
