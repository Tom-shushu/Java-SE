package biz.manytoone.b;

import java.util.List;

import bean.manytoone.a.StuInfo;
import dao.manytoone.b.StuInfoDAO;

public class StuBiz {

	private StuInfoDAO sidao = new StuInfoDAO();

	public List<StuInfo> findAllStu(){
		return sidao.findAllStu();
	}
}
