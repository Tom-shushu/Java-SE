package test;

import java.util.List;

import bean.manytoone.a.StuInfo;
import biz.manytoone.b.StuBiz;

public class C {

	public static void main(String[] args) {
		StuBiz sb = new StuBiz();
		
		List<StuInfo> list = sb.findAllStu();
		for (StuInfo si : list) {
			System.out.println(si);
		}
		
	}
}
