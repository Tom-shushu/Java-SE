package biz.onetomany;

import java.util.List;
import java.util.Set;

import bean.onetomany.ClassInfo;
import bean.onetomany.StuInfo;
import dao.onetomany.ClassInfoDAO;
import dao.onetomany.StuInfoDAO;

public class ClassBiz {

	private ClassInfoDAO cidao = new ClassInfoDAO();
	private StuInfoDAO sidao = new StuInfoDAO();
	public List<ClassInfo> findAllClass(){
		List<ClassInfo> list = cidao.findAllClass();
		for (ClassInfo ci : list) {
			int classId = ci.getClassId();
			Set<StuInfo> stuSet = sidao.findByClassId(classId);
			ci.setStuSet(stuSet);
		}
		return list;
	}
}
