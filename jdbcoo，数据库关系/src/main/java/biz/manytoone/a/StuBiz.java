package biz.manytoone.a;

import java.util.List;

import bean.manytoone.a.ClassInfo;
import bean.manytoone.a.StuInfo;
import dao.manytoone.a.ClassInfoDAO;
import dao.manytoone.a.StuInfoDAO;

public class StuBiz {

	private StuInfoDAO sidao = new StuInfoDAO();
	private ClassInfoDAO cidao = new ClassInfoDAO();
	
	//²ðÏä×°Ïä²Ù×÷
	public List<StuInfo> findAllStu(){
		List<StuInfo> list = sidao.findAllStu();
		for (StuInfo si : list) {
			int classId = si.getCi().getClassId();
			ClassInfo ci = cidao.findById(classId);
			si.setCi(ci);
		}
		return list;
	}
	
}
